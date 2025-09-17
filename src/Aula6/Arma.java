package Aula6;

public class Arma {
    private String nome;
    private int dano;
    private String efeito;
    
    public Arma(String nome, int dano, String efeito){
        this.dano = dano;
        this.nome = nome;
        this.efeito = efeito;
    }
    
    public String getNome(){
        return nome;
    }
    public void atira(){
        System.out.println(efeito);
        System.out.println("\nCausou " + dano + " danos");
    }
    
    public void print(){
        String str = "";
        str = "\nNome: " + nome+
                "\nDano: " + dano +
                "\nEfeito: " + efeito;
        System.out.println(str);
    }
}
