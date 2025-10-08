package Aula7_Tarefa;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        tarefas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionarTarefa(int id,String descricao, Membro membro, String status){
        Tarefa t = new Tarefa(id, descricao, status, membro);
        tarefas.add(t);
    }
    
    public void removerTarefa(int indice){
        tarefas.remove(indice);
    }
    
    public void listarTarefas(){
        for(Tarefa t : tarefas){
            System.out.println(t.print());
        }
    }
    
    public String print(){
        String str = "\nNome do projeto: " + this.nome + "\nQuantidade de tarefas: " + tarefas.size();
        return str;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
}
