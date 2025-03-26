package org.designPatters.terceiraListaExercicios.sistemaNotificacoes.service;

import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.factory.EmailNotificationFactory;
import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.factory.NotificationFactory;
import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.factory.SMSNotificationFactory;
import org.designPatters.terceiraListaExercicios.sistemaNotificacoes.notification.Notification;

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