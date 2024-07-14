package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> umDigito = numeros.stream().filter(n->n<10).toList();
        Integer variosDigitos = numeros.stream().filter(n->n>=10).reduce(0,(a,b)->(a/10+a%10)+(b/10+b%10));
        Integer somaTotal = umDigito.stream().reduce(0,(a,b)->a+b)+variosDigitos;
        System.out.println(somaTotal);
    }
}
