package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueprodutosMap;

    public EstoqueProdutos() {
        this.estoqueprodutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod,String nome,int quantidade,double preco){
        this.estoqueprodutosMap.put(cod,new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueprodutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque=0;
        if (!estoqueprodutosMap.isEmpty()){
            for (Produto p:estoqueprodutosMap.values()){
                valorTotalEstoque += p.getQuantidade()*p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto produtoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueprodutosMap.isEmpty()) {
            for (Produto p : estoqueprodutosMap.values()) {
                if (p.getPreco()>maiorPreco){
                    produtoMaisCaro=p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto produtoMaisBarato(){
        Produto produtoMaisBarato=null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueprodutosMap.isEmpty()){
            for (Produto p: estoqueprodutosMap.values()){
                if (p.getPreco()<menorPreco){
                    produtoMaisBarato=p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto produtoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maiorQuantidadeValorTotal = null;
        double maiorQuantVsValor = Double.MIN_VALUE;
        if (!estoqueprodutosMap.isEmpty()){
            for (Produto p:estoqueprodutosMap.values()){
                if ((p.getPreco()*p.getQuantidade())>maiorQuantVsValor){
                    maiorQuantidadeValorTotal=p;
                }
            }
        }
        return maiorQuantidadeValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1,"Produto A",10,5.0);
        estoqueProdutos.adicionarProduto(2,"Produto B",5,10.0);
        estoqueProdutos.adicionarProduto(3,"Produto C",2,15.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: "+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoqueProdutos.produtoMaisCaro());
    }
}
