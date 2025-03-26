package org.designPatters.terceiraListaExercicios.sistemaNotificacoes.factory;

import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.notification.Notification;
import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.notification.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}