package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {

    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public abstract Mensagem sendMessage(String mensagem);

    public String toString() {
        return "Contatinho: " + destinatario + ", hora de envio: " + horaEnvio + ", conteúdo: " + conteudo;
    }

}
