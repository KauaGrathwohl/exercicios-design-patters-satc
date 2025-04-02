package org.designPatters.factoryMethod.sistemaNotificacoes.factory;

import org.designPatters.factoryMethod.sistemaNotificacoes.notification.EmailNotification;
import org.designPatters.factoryMethod.sistemaNotificacoes.notification.Notification;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}