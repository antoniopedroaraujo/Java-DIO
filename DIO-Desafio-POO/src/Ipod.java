public class Ipod implements ReprodutorMusical{
    public void tocar() {
        System.out.println("Ipod - A música está tocando.\n");
    }

    public void pausar() {
        System.out.println("Ipod - A música foi pausada.\n");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Ipod - A música "+musica+" foi selecionada.\n");
    }
}
