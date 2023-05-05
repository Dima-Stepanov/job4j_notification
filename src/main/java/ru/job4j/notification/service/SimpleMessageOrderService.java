package ru.job4j.notification.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.job4j.notification.domain.MessageOrder;
import ru.job4j.notification.repository.MessageOrderRepository;

import java.util.Optional;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j NOTIFICATION
 * 3. Spring boot + Kafka [#505039]
 * SimpleMessageOrderService слой бизнес логики обработки модели MessageOrder
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.05.2023
 */
@Service
@AllArgsConstructor
@Slf4j
public class SimpleMessageOrderService implements MessageOrderService {
    private final MessageOrderRepository messageOrderRepository;

    @Override
    public Optional<MessageOrder> create(MessageOrder messageOrder) {
        try {
            messageOrderRepository.save(messageOrder);
            return Optional.of(messageOrder);
        } catch (Exception e) {
            log.error("Fail create messageOrder: {}, error: {}", messageOrder, e);
            return Optional.empty();
        }
    }
}
