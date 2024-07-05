package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new TreeMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String resultado = null;
        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String,String > entry: palavrasMap.entrySet()){
                if (entry.getKey().equalsIgnoreCase(palavra)){
                    resultado = entry.getValue();
                }
            }
        }
        return resultado;
    }
}
