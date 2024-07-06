package main.java.map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String ,Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link,String titulo,String autor,double preco){
        livrosMap.put(link,new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if (!livrosMap.isEmpty()) {
            for (Map.Entry<String,Livro> entry:livrosMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livrosMap.remove(entry.getKey());
                }
            }
        }
    }

    public Map<String,Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String,Livro>> livrosParaOrdenarPreco = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosParaOrdenarPreco, new ComparaPreco());

        Map<String ,Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry:livrosParaOrdenarPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(),entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparaAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public List<Livro> obterLivroMaisBarato(){
        List<Livro> livrosBaratos = new ArrayList<>();
        double valorMinimo = Double.MAX_VALUE;
        if(!livrosMap.isEmpty()){
            for (Map.Entry<String,Livro> entry:livrosMap.entrySet()){
                if (entry.getValue().getPreco()<valorMinimo){
                    valorMinimo = entry.getValue().getPreco();
                }
            }
            for (Map.Entry<String, Livro> entry:livrosMap.entrySet()){
                if (entry.getValue().getPreco() == valorMinimo){
                    Livro livroBarato = livrosMap.get(entry.getKey());
                    livrosBaratos.add(livroBarato);
                }
            }
        }
        return livrosBaratos;
    }

    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livrosCaros = new ArrayList<>();
        double valorMaximo = Double.MIN_VALUE;
        if(!livrosMap.isEmpty()){
            for (Map.Entry<String,Livro> entry:livrosMap.entrySet()){
                if (entry.getValue().getPreco()>valorMaximo){
                    valorMaximo = entry.getValue().getPreco();
                }
            }
            for (Map.Entry<String, Livro> entry:livrosMap.entrySet()){
                if (entry.getValue().getPreco() == valorMaximo){
                    Livro livroCaro = livrosMap.get(entry.getKey());
                    livrosCaros.add(livroCaro);
                }
            }
        }
        return livrosCaros;

    }
}
