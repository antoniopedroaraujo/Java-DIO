package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private ArrayList<Integer> numerosList;

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(numerosList);
        Collections.sort(numerosAscendentes,new Ascendente());
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(numerosList);
        Collections.sort(numerosDescendentes,new Descendente());
        return numerosDescendentes;
    }
    public void exibirNumeros(){
        System.out.println(numerosList);
    }
}

class Ascendente implements Comparator<Integer>{

    @Override
    public int compare(Integer i1, Integer i2) {
        return compare(i1, i2);
    }
}

class Descendente implements Comparator<Integer>{

    @Override
    public int compare(Integer i1, Integer i2) {
        return Integer.compare(i2,i1);
    }
}
