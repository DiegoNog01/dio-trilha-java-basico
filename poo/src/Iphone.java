public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("---------NavegadorInternet-----------");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("----------ReprodutorMusical----------");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("--------ArapelhoTelefonico--------");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
       System.out.println("Selecionando Musica");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }
}
