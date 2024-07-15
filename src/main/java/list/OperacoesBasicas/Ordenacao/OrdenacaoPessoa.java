package list.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Ana",25,1.65);
        ordenacaoPessoa.adicionarPessoa("Bruno",30,1.75);
        ordenacaoPessoa.adicionarPessoa("Carlos",25,1.80);
        ordenacaoPessoa.adicionarPessoa("Daniela",28,1.75);
        ordenacaoPessoa.adicionarPessoa("Eduardo",30,1.85);

        System.out.println("Ordenado por idade " + ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordenado por altura " + ordenacaoPessoa.ordenarPorAltura());

    }

}
