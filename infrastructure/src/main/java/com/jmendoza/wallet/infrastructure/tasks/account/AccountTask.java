package com.jmendoza.wallet.infrastructure.tasks.account;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AccountTask {

    private static final Logger loggerException = LogManager.getLogger(AccountTask.class);

    @Scheduled(cron = "${task.account.cron.expression}", zone = "${time.zone.id}")
    public void syncAccountTask() {
        try {
            //TODO: Invoke Adapter of Infrastructure (Data Base, API, Message Broker)
            System.out.println("Invoke Adapter of Infrastructure (Data Base, API, Message Broker)");
        } catch (Exception e) {
            loggerException.error(e);
        }
    }
}
