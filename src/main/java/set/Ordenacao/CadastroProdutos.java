package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quatidade){
        produtoSet.add(new Produto(cod,nome, preco, quatidade));
    }


    public  Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosProNome = new TreeSet<>(produtoSet);
        return produtosProNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1,"Produto 1", 25.0, 5);
        cadastroProdutos.adicionarProduto(2,"Produto 2", 105.0, 6);
        cadastroProdutos.adicionarProduto(1,"Produto 3", 35.0, 20);
        cadastroProdutos.adicionarProduto(9,"Produto 4", 4.80, 23);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println("\nProdutos por nome \n" + cadastroProdutos.exibirProdutoPorNome());

        System.out.println("\nProdutos por preço \n" + cadastroProdutos.exibirProdutoPorPreco());
    }
}
