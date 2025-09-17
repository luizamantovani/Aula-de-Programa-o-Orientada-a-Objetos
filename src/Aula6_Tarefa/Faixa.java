package Aula6_Tarefa;

public class Faixa {
    private String titulo;
    private String artista;
    private int duracao;

    public Faixa(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }
    
    public String print(){
        String str = "Titulo: " + titulo+
                "\nArtista: " + artista+
                "\nDuração: " + duracao +"s\n";
        
        return str;
    }
    
    public void reproduzir(){
        System.out.println("\nReproduzindo: ");
        System.out.println(print());
    }
}
