package Aula4;

public class Aluno {
    String ra;
    String nome;
    String curso;
    
    public Aluno(String ra, String nome, String Curso){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    public void imprimir(){
        String msn = "RA: " + ra+
                "Nome: " + nome +
                "Curso: " + curso;
        
        System.out.println(msn);
    }
}
