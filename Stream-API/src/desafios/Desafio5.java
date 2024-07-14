package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> maiorQue5 = numeros.stream().filter(n->n>5).toList();
        Double media = (double) (maiorQue5.stream().reduce(0,(a, b)->a+b)/maiorQue5.size());
        System.out.println(media);
    }
}
