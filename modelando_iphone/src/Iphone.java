public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        
        // Testando métodos do ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Calcinha Preta - Manchete de Jornais");
        
        // Testando métodos do AparelhoTelefonico
        iphone.ligar("85988888888");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        // Testando métodos do NavegadorNaInternet
        iphone.exibirPagina("http://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Implementação dos métodos de NavegadorNaInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
