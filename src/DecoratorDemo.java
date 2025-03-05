public class DecoratorDemo {
    public static void main(String[] args) {
        // Criando uma mensagem simples
        Mensagem mensagem = new MensagemPublica("Olá, usuário!");
    
        // Decorando com criptografia
        Mensagem mensagemCriptografada = new MensagemCriptografada(mensagem);
        System.out.println(mensagemCriptografada.enviar());

        // Decorando com compressão
        Mensagem mensagemComprimida = new MensagemComprimida(mensagem);
        System.out.println(mensagemComprimida.enviar());

        // Aplicando os dois decoradores juntos (Criptografada e Comprimida)
        Mensagem mensagemCriptografadaEComprimida = new MensagemComprimida(new MensagemCriptografada(mensagem));
        System.out.println(mensagemCriptografadaEComprimida.enviar());
    }
}