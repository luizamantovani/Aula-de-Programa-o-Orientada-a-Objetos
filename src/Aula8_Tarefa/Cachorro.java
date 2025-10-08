package Aula8_Tarefa;

public class Cachorro extends Animal{
    private int velocidade;

    public Cachorro() {
    }

    public Cachorro(int velocidade, String nome, int idade) {
        super(nome, idade);
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    @Override
    public String imprimir(){
        String str = "===== Cachorro ====="
                + super.imprimir()
                + "\nVelocidade: " + velocidade;
        
        return str;
    }
    
    @Override
    public String falar(){
        String str = "Auauauau";
        return str;
    }
}
