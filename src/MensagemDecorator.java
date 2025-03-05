public abstract class MensagemDecorator implements Mensagem {
    protected Mensagem mensagemDecorada;

    public MensagemDecorator(Mensagem mensagem) {
        this.mensagemDecorada = mensagem;
    }

    @Override
    public String enviar() {
        return mensagemDecorada.enviar();
    }
}
