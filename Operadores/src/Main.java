public class Main {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = numero*-1;
        System.out.println(numero);

        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);

        numero += 2;
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int a,b;
        a=5;
        b=6;
        String resultado = "";
        resultado = a==b? "sim":"nao";
        System.out.println(resultado);

        int numeroUm = 1;
        int numeroDois = 2;
        boolean simNao = numeroUm == numeroDois;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        simNao = numeroUm!=numeroDois;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        simNao = numeroUm>numeroDois;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        String nomeUm = "Antonio";
        String nomeDois = new String("Antonio");
        System.out.println(nomeUm==nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } else {
            System.out.println("Pelo menos uma condição é falsa");
        }
        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma condição é verdadeira");
        } else {
            System.out.println("Todas as condições são falsas");
        }
    }
}