package tr.com.huseyinaydin.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Boot, Apache Kafka, RabbitMQ, MongoDB, PostgreSQL, Docker, Docker Compose, Zipkin, AWS ile Microservices çalışmamdır.
 *
 */

public interface FraudCheckHistoryRepository
        extends JpaRepository<FraudCheckHistory, Integer> {
}