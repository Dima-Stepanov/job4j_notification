package ru.job4j.notification.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j NOTIFICATION
 * 3. Spring boot + Kafka [#505039]
 * OrderDTO DTO модель для отображение заказа и его компонентов. Сервис JOB4J_ORDER
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.05.2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private int id;
    private String name;
    private String description;
    private int statusId;
    private String status;
    private int dishId;
    private String dishName;
}
