package map.OperacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Dennis", 123123);
        agendaContatos.adicionarContato("Dennis ALmeida", 111123);
        agendaContatos.adicionarContato("Dennis", 123111);
        agendaContatos.adicionarContato("Meiry", 222333);
        agendaContatos.adicionarContato("Meiry ELS", 333333);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Meiry");

        agendaContatos.exibirContato();
    }

}
