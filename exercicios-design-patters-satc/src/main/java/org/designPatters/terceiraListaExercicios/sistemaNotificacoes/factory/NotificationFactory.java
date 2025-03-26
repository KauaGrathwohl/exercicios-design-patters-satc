package org.designPatters.terceiraListaExercicios.sistemaNotificacoes.factory;

import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.notification.Notification;

public interface NotificationFactory {
    Notification createNotification();
}