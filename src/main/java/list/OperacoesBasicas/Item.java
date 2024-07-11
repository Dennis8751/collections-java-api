package list.OperacoesBasicas;

public class Item {

    private String nomeItem;
    private double preco;
    private int quantidade;


    public Item(String nomeItem, double preco, int quantidade) {
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString(){
        return "Item\n " +
                "Nome: " + nomeItem + "\n" +
                "Preço: R$" + preco + "\n" +
                "Quantidade: " + quantidade +
                "\n";
    }
}
