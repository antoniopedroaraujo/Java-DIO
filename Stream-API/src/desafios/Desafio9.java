package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosDistintos = numeros.stream().distinct().toList();
        Boolean distinto = numeros.stream().count() == numerosDistintos.stream().count();
        System.out.println(distinto);
    }
}
