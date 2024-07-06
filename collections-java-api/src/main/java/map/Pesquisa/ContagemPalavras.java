package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String ,Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra,Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public int exibirContagemPalavras() {
        int total = 0;
        for (int contagem:palavrasMap.values()){
            total+=contagem;
        }
        return total;
    }
     public Map.Entry<String,Integer> encontrarPalavraMaisFrequente() {
        Map.Entry<String,Integer >maiorQuantidade = new Map.Entry<String, Integer>() {
            @Override
            public String getKey() {
                return "";
            }

            @Override
            public Integer getValue() {
                return 0;
            }

            @Override
            public Integer setValue(Integer value) {
                return 0;
            }
        };
        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String,Integer> entry:palavrasMap.entrySet()) {
                if (entry.getValue()>maiorQuantidade.getValue()){
                    maiorQuantidade = entry;
                }
            }
        }
        return maiorQuantidade;
     }
}
