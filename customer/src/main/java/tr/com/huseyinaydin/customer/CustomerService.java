package tr.com.huseyinaydin.customer;

import tr.com.huseyinaydin.amqp.RabbitMQMessageProducer;
import tr.com.huseyinaydin.clients.fraud.FraudCheckResponse;
import tr.com.huseyinaydin.clients.fraud.FraudClient;
import tr.com.huseyinaydin.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Boot, Apache Kafka, RabbitMQ, MongoDB, PostgreSQL, Docker, Docker Compose, Zipkin, AWS ile Microservices çalışmamdır.
 *
 */

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;
    private final RabbitMQMessageProducer rabbitMQMessageProducer;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: e-posta geçerli mi? İş kuralı yapılacak.
        // todo: e-posta başkası tarafından alınmış mı? Gerçekten var mı böyle bir e-posta yapılacak.
        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("Dolandırıcı sie!");
        }

        NotificationRequest notificationRequest = new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Merhaba %s, hoşgeldin gardaş veya bacıgardaş...",
                        customer.getFirstName())
        );
        rabbitMQMessageProducer.publish(
                notificationRequest,
                "internal.exchange",
                "internal.notification.routing-key"
        );
    }
}