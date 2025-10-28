package Aula9_Tarefa.entity;

public class Produto {
    
    private int id;
    private String nome;
    private int quantidade;
    private double valorUnitario;
    
    public Produto() {
    }

    public Produto(String nome, int quantidade, double valorUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public Produto(int id, String nome, int quantidade, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    
    public String imprimir(){
        String str = "\n================"
                + "\nID: " + this.id +
                "\nNome: " + this.nome +
                "\nQuantidade: " + this.quantidade +
                "\nValor: " + this.valorUnitario;
        return str;
    }
}
