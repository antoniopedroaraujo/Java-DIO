public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet{
    public void tocar() {
        System.out.println("Iphone - A música está tocando.\n");
    }

    public void pausar() {
        System.out.println("Iphone - A música foi pausada.\n");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Iphone - A música "+musica+" foi selecionada.\n");
    }

    public void atender() {
        System.out.println("Iphone - Atendendo a ligação.\n");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iphone - Correio de voz iniciado.\n");
    }

    public void ligar(String numero) {
        System.out.println("Iphone - Ligando para o número - ("+numero+").\n");
    }

    public void adicionarNovaAba() {
        System.out.println("Iphone - Nova aba adicionada.\n");
    }

    public void atualizarPagina() {
        System.out.println("Iphone - Atualizando a página.\n");
    }

    public void exibirPagina(String url) {
        System.out.println("Iphone - Exibindo a página no endereço: ("+url+").\n");
    }
}
