package org.designPatters.factoryMethod.sistemaNotificacoes.factory;

import org.designPatters.factoryMethod.sistemaNotificacoes.notification.Notification;

public interface NotificationFactory {
    Notification createNotification();
}