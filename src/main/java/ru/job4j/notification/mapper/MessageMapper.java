package ru.job4j.notification.mapper;

import org.springframework.stereotype.Component;
import ru.job4j.notification.domain.MessageOrder;
import ru.job4j.notification.domain.dto.OrderDTO;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j NOTIFICATION
 * 3. Spring boot + Kafka [#505039]
 * MessageMapper класс для преобразования DAO Message в DTO модели и наоборот.
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.05.2023
 */
@Component
public class MessageMapper {
    public MessageOrder getMessageOrderByOrderDTO(OrderDTO orderDTO) {
        return new MessageOrder(0, orderDTO.getId(),
                "Заказ: N " + orderDTO.getId() + ", содержит: " + orderDTO.getDishName(),
                orderDTO.getDishName(),
                orderDTO.getStatus());
    }
}
