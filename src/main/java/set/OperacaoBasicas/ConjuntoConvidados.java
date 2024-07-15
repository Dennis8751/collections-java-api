package set.OperacaoBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set convidados");

        conjuntoConvidados.adicionarConvidados("Convidado 1", 12345);
        conjuntoConvidados.adicionarConvidados("Convidado 2", 54321);
        conjuntoConvidados.adicionarConvidados("Convidado 3", 54321);
        conjuntoConvidados.adicionarConvidados("Convidado 4", 87654);
        conjuntoConvidados.adicionarConvidados("Convidado 5", 56789);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(56789);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set convidados");

        conjuntoConvidados.exibirConvidados();


    }
}
