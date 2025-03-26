package org.designPatters.terceiraListaExercicios.sistemaNotificacoes.factory;

import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.notification.EmailNotification;
import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.notification.Notification;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}