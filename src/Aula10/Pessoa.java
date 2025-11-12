package Aula10;

public class Pessoa {
    private String nome;
    private static int contador;
    
    public Pessoa(String nome){
        this.nome = nome;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void mostrarTotalPessoas(){
        System.out.println("\nTotal de Pessoas: " + contador);
    }
    
    
}
