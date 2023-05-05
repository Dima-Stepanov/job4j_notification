package ru.job4j.notification.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.notification.domain.MessageOrder;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j NOTIFICATION
 * 3. Spring boot + Kafka [#505039]
 * MessageOrderRepository Spring Data-JPA хранение модели данных MessageOrder в базе данных
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.05.2023
 */
public interface MessageOrderRepository extends CrudRepository<MessageOrder, Integer> {
}
