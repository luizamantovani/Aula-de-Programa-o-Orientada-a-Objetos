package Aula4_Tarefa;

public class Animal {
    private String nome;
    private String tipo;
    private int idade;
    private int energia;
    private int felicidade;
    
    public Animal(String nome, String tipo, int idade){
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.energia = 100;
        this.felicidade = 100;
    }

    public int getEnergia() {
        return energia;
    }
    
    
    public void alimentar(){
        this.energia+=10;
    }
    
    public void brincar(){
        this.felicidade += 10;
        this.energia -= 5;
    }
    
    public void dormir(){
        this.energia = 100;
    }
    
    public void mostrarStatus(){
        String msn = "Nome: " + nome +
                "\nTipo: " + tipo +
                "\nIdade: " + idade +
                "\nEnergia: " + energia +
                "\nFelicidade: " + felicidade;
        
        System.out.println(msn);
    }
}
