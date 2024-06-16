public class Usuario {
    public static void main(String[] args) {
        SmartTv smartv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartv.ligada);
        System.out.println("Canal atual : " + smartv.canal);
        System.out.println("Volume atual : " + smartv.volume);

        smartv.ligar();
        System.out.println("Novo status -> Tv Ligada ? " + smartv.ligada);

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();

    }
}