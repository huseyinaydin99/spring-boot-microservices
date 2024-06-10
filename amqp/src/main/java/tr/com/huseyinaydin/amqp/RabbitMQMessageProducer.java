package tr.com.huseyinaydin.amqp;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Boot, Apache Kafka, RabbitMQ, MongoDB, PostgreSQL, Docker, Docker Compose, Zipkin, AWS ile Microservices çalışmamdır.
 *
 */

@Component
@Slf4j
@AllArgsConstructor
public class RabbitMQMessageProducer {

    private final AmqpTemplate amqpTemplate;

    public void publish(Object payload, String exchange, String routingKey) {
        log.info("Paylaşılan: {} Kullanılan routingKey: {}. Gönderilen: {}", exchange, routingKey, payload);
        amqpTemplate.convertAndSend(exchange, routingKey, payload);
        log.info("Paylaşılan: {} Kullanılan routingKey: {}. Gönderilen: {}", exchange, routingKey, payload);
    }
}