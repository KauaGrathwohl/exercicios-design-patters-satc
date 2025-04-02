package org.designPatters.factoryMethod.sistemaNotificacoes.factory;

import org.designPatters.factoryMethod.sistemaNotificacoes.notification.Notification;
import org.designPatters.factoryMethod.sistemaNotificacoes.notification.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}