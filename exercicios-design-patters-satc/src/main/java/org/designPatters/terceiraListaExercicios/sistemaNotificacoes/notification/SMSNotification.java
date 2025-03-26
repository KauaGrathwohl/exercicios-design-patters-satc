package org.designPatters.terceiraListaExercicios.sistemaNotificacoes.notification;

public class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}