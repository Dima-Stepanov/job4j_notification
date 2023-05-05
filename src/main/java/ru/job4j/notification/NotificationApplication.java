package ru.job4j.notification;

import liquibase.integration.spring.SpringLiquibase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j NOTIFICATION
 * 3. Spring boot + Kafka [#505039]
 * NotificationApplication класс запуска сервиса Notification
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 05.05.2023
 */
@SpringBootApplication
@Slf4j
public class NotificationApplication {
    private static final String URL_JOB4J_NOTIFICATION = "http://localhost:8084/notification";

    /**
     * Создание SpringLiquibase
     *
     * @param ds DataSource
     * @return SpringLiquibase
     */
    @Bean
    public SpringLiquibase liquibase(DataSource ds) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db/changelog/liquibase-changeLog.xml");
        liquibase.setDataSource(ds);
        return liquibase;
    }

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
        log.info("GO TO {}", URL_JOB4J_NOTIFICATION);
    }

}
