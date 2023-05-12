package ru.job4j.notification.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j.notification.domain.dto.OrderDTO;
import ru.job4j.notification.mapper.MessageMapper;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j NOTIFICATION
 * 3. Spring boot + Kafka [#505039]
 * KafkaNotificationOrderService реализация обмена сообщениями через KAFKA.
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.05.2023
 */
@Service
@AllArgsConstructor
@Slf4j
public class KafkaNotificationOrderService implements KafkaService<String, OrderDTO, OrderDTO> {
    private static final String TOPIC_NOTIFICATION = "job4j_notifications";
    private final SimpleMessageOrderService service;
    private final MessageMapper mapper;

    @Override
    public void sendMessage(String topic, String key, OrderDTO type) {
        log.error("The method 'sendMessage', is not overridden");
        throw new RuntimeException("The method 'sendMessage', is not overridden");
    }

    /**
     * Метод получения данных из очереди сообщений "job4j_orders"
     *
     * @param record Тело сообщения
     * @return OrderDto
     */
    @KafkaListener(topics = TOPIC_NOTIFICATION)
    @Override
    public OrderDTO receive(ConsumerRecord<String, OrderDTO> record) {
        log.debug("KAFKA PARTITION {}", record.partition());
        log.debug("KAFKA KEY {}", record.key());
        log.debug("KAFKA VALUE {}", record.value());
        OrderDTO orderDTO = record.value();
        service.create(mapper.getMessageOrderByOrderDTO(orderDTO));
        return orderDTO;
    }
}
