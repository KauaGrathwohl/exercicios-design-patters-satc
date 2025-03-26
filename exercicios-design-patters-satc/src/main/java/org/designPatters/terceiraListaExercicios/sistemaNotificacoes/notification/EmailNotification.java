package org.designPatters.terceiraListaExercicios.sistemaNotificacoes.notification;

public class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}