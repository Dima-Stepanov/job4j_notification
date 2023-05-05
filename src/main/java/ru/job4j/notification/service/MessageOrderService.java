package ru.job4j.notification.service;

import ru.job4j.notification.domain.MessageOrder;

import java.util.Optional;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j NOTIFICATION
 * 3. Spring boot + Kafka [#505039]
 * MessageOrderService интерфейс описывает поведение слоя бизнес логики,
 * для работы с моделью MessageOrder
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.05.2023
 */
public interface MessageOrderService {
    Optional<MessageOrder> create(MessageOrder messageOrder);
}
