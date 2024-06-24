public class Telefone implements AparelhoTelefonico{
    public void atender() {
        System.out.println("Telefone - Atendendo a ligação.\n");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Telefone - Correio de voz iniciado.\n");
    }

    public void ligar(String numero) {
        System.out.println("Telefone - Ligando para o número - ("+numero+").\n");
    }
}
