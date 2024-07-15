package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.Locale;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, preco,quantidade));
    }

    public void exibitProduto(){
        System.out.println(estoqueProdutoMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibitProduto();

        estoqueProdutos.adicionarProduto(1, "Produto A", 10, 10.0);
        estoqueProdutos.adicionarProduto(2, "Produto B", 25, 100.5);
        estoqueProdutos.adicionarProduto(3, "Produto C", 8, 1500.5);
        estoqueProdutos.adicionarProduto(4, "Produto D", 3, 100.5);

        estoqueProdutos.exibitProduto();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
