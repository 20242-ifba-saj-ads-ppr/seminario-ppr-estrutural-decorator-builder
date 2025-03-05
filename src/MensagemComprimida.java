public class MensagemComprimida extends MensagemDecorator {
    public MensagemComprimida(Mensagem mensagem) {
        super(mensagem);
    }

    @Override
    public String enviar() {
        return "Comprimida -> " + super.enviar();
    }
}
