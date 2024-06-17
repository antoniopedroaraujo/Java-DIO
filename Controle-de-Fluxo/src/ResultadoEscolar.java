public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >=5 ) {
            System.out.println("Prova Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        String resultado = nota >= 7? "Aprovado" : nota >=5? "Prova" : "Reprovado";
        System.out.println(resultado);
    }
}
