package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isPrimo = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                boolean primo = true;
                if (num % 2 == 0) primo = false;
                for (int i = 3; i * i <= num; i += 2) {
                    if (num % i == 0)
                        primo = false;
                }
                return primo;
            }
        };

        List<Integer> maiorPrimo = numeros.stream().sorted().filter(isPrimo).toList();
        System.out.println(maiorPrimo.getLast());
    }
}
