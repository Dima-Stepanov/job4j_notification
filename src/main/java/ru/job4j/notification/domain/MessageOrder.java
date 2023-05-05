package ru.job4j.notification.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j NOTIFICATION
 * 3. Spring boot + Kafka [#505039]
 * MessageOrder DAO модель описывает сообщение о заказе.
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.05.2023
 */
@Entity
@Table(name = "MESSAGES_ORDERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MessageOrder {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ORDER_ID")
    private int orderId;
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "DISH_NAME")
    private String dishName;
    @Column(name = "STATUS")
    private String status;
}
