package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoNumeros {
    private ArrayList<Integer> numerosList;

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(numerosList,new Ascendente());
    }

    public void ordenarDescendente(){
        Collections.sort(numerosList,new Descendente());
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
