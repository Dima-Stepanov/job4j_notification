--Создание таблицы для хранения моделей блюд DISH
CREATE TABLE messages_orders
(
    id        SERIAL PRIMARY KEY,
    order_id  INT,
    message   VARCHAR(2000),
    dish_name VARCHAR(2000),
    status    VARCHAR(2000)
);