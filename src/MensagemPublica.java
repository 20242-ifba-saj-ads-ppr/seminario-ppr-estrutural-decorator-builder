public class MensagemPublica implements Mensagem {
    private String conteudo;

    public MensagemPublica(String conteudo) {
        this.conteudo = conteudo;
    }
    
    @Override
    public String enviar() {
        return "Mensagem: " + conteudo;
    }
    
    
}

