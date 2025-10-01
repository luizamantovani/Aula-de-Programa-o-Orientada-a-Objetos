package Aula7;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private ArrayList<Funcionario> lstFuncionarios;
    private Funcionario chefe;
    
    public Funcionario(String nome){
        this.nome = nome;
        lstFuncionarios = new ArrayList<>();
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addFuncionario(Funcionario func){
        lstFuncionarios.add(func);
    }
    
    public void imprimirFuncionarios(){
        for(Funcionario f : lstFuncionarios){
            System.out.println("f.getNome()");
        }
    }
    
    public void imprimir(){
        System.out.println("\nNome: " + this.nome);
    }
        
        
}
