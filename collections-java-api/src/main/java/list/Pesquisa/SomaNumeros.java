package main.java.list.Pesquisa;

import java.util.ArrayList;

public class SomaNumeros {
    private ArrayList<Integer> numerosList;

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public Integer calcularSoma(){
        int soma = 0;
        if (!numerosList.isEmpty()){
            for (Integer i: numerosList){
                soma += i;
            }
        }
        return soma;
    }

    public Integer encontrarMaiorNumero(){
        Integer maior = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()){
            for (Integer i : numerosList){
                if (i > maior){
                    maior = i;
                }
            }
        }
        return maior;
    }

    public Integer encontrarMenorNumero(){
        Integer menor = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()){
            for (Integer i : numerosList){
                if (i < menor){
                    menor = i;
                }
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }
}
