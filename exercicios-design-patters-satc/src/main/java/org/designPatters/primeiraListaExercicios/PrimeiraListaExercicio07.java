package org.designPatters.primeiraListaExercicios;

public class PrimeiraListaExercicio07 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("João");

        Notificacao email = new EmailNotificacao();
        Notificacao sms = new SmsNotificacao();
        Notificacao push = new PushNotificacao();

        usuario.receberNotificacao(email, "Você tem um novo e-mail.");
        usuario.receberNotificacao(sms, "Você recebeu um SMS.");
        usuario.receberNotificacao(push, "Você tem uma nova push notification.");
    }
}

interface Notificacao {
    void enviar(String mensagem);
}

class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}

class SmsNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}

class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando push notification: " + mensagem);
    }
}

class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void receberNotificacao(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem);
    }
}