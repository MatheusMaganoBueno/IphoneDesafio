public class Iphone {


    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.selecionarMusica();

        reprodutorMusical.tocarMusica();

        reprodutorMusical.pausarMusica();


        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        aparelhoTelefonico.ligar();

        aparelhoTelefonico.atender();

        aparelhoTelefonico.correioVoz();


        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();

        navegadorNaInternet.exibirPagina();

        navegadorNaInternet.adicionarNovaAba();

        navegadorNaInternet.atualizarPagina();
    }
}
