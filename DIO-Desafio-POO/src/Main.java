public class Main {
    public static void main(String[] args) {
        //Usando Ipod
        Ipod ipod = new Ipod();

        ipod.selecionarMusica("Stereo Hearts");
        ipod.tocar();
        ipod.pausar();

        //Usando Telefone
        Telefone telefone = new Telefone();

        telefone.ligar("190");
        telefone.iniciarCorreioVoz();
        telefone.atender();

        //Usando Safari
        Safari safari = new Safari();

        safari.adicionarNovaAba();
        safari.exibirPagina("https://www.google.com.br");
        safari.atualizarPagina();

        //Usando Iphone
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Stressed Out");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("192");
        iphone.iniciarCorreioVoz();
        iphone.atender();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://github.com");
        iphone.atualizarPagina();
    }
}
