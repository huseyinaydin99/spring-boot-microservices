package tr.com.huseyinaydin.clients.notification;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Boot, Apache Kafka, RabbitMQ, MongoDB, PostgreSQL, Docker, Docker Compose, Zipkin, AWS ile Microservices çalışmamdır.
 *
 */

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}