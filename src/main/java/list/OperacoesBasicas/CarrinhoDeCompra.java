package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itemCompraLista;

    public CarrinhoDeCompra() {
        this.itemCompraLista = new ArrayList<>();
    }

    public void adicionarItem(String nomeItem, double preco, int quantidade) {
        Item item = new Item(nomeItem, preco, quantidade);
        this.itemCompraLista.add(item);
    }

    public void removerItem(String item) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemCompraLista.isEmpty()) {
            for (Item i : itemCompraLista) {
                if (i.getNomeItem().equalsIgnoreCase(item)) {
                    itemParaRemover.add(i);
                }
            }
            itemCompraLista.removeAll(itemParaRemover);
        } else {
            System.out.println("Lista está vazia");
        }
    }

    public double calcularValor() {
        double valorItemTotal = 0;
        if (!itemCompraLista.isEmpty()) {
            for (Item item : itemCompraLista) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorItemTotal = +valorItem;
            }
            return valorItemTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        if (!itemCompraLista.isEmpty()){
            System.out.println(this.itemCompraLista);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    public String toString(){
        return "Carrinho de Compras" +
                "\nItens: " + itemCompraLista;
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("Panela",38.99,2);
        carrinhoDeCompra.adicionarItem("Tênis",250,1);
        carrinhoDeCompra.adicionarItem("Xicará",6.89,4);
        carrinhoDeCompra.adicionarItem("Kit Ferramentas",389.90,1);

        carrinhoDeCompra.exibirItens();
        System.out.println("Valor total da compra: R$" + carrinhoDeCompra.calcularValor());

        carrinhoDeCompra.adicionarItem("Jaqueta", 120, 2);

        carrinhoDeCompra.exibirItens();
        System.out.println("Valor total da compra: R$" + carrinhoDeCompra.calcularValor());

        carrinhoDeCompra.removerItem("Panela");

        carrinhoDeCompra.exibirItens();
        System.out.println("Valor total da compra: R$" + carrinhoDeCompra.calcularValor());

    }

}
