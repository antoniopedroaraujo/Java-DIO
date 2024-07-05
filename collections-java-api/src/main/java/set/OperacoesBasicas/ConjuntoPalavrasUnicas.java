package main.java.set.OperacoesBasicas;

import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String > palavrasSet;

    public void adicionarPalavra(String palavra){
        if (!palavrasSet.isEmpty()){
            palavrasSet.add(palavra);
        }
    }

    public void removerPalavra(String palavra){
        if (!palavrasSet.isEmpty()){
            palavrasSet.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }
}
