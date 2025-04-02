package org.designPatters.factoryMethod.sistemaNotificacoes.service;

import org.designPatters.factoryMethod.sistemaNotificacoes.factory.EmailNotificationFactory;
import org.designPatters.factoryMethod.sistemaNotificacoes.factory.NotificationFactory;
import org.designPatters.factoryMethod.sistemaNotificacoes.factory.SMSNotificationFactory;
import org.designPatters.factoryMethod.sistemaNotificacoes.notification.Notification;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.send("Olá via Email!");

        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.send("Olá via SMS!");
    }
}