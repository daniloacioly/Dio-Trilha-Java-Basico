public class Main {
    public static void main(String[] args) {
        Iphone meuiPhone = new Iphone();
        
        System.out.println("- Reprodutor Musical -");
        meuiPhone.selecionarMusica("Imagine Dragons");
        meuiPhone.tocar();
        meuiPhone.pausar();
        
        System.out.println("\n- Aparelho Telefônico -");
        meuiPhone.ligar("555555555");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();
        
        System.out.println("\n- Navegador na Internet -");
        meuiPhone.exibirPagina("https://www.google.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
