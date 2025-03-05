public class MensagemCriptografada extends MensagemDecorator {
    public MensagemCriptografada(Mensagem mensagem) {
        super(mensagem);
    }

    @Override
    public String enviar() {
        return "Criptografada -> " + super.enviar();
    }
}