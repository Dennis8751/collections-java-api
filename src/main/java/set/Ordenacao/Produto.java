package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long produto, String nome, double preco, int quantidade) {
        this.codigo = produto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getProduto() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "\nProduto: "+
                "Produto = " + codigo +
                ", nome = " + nome + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}