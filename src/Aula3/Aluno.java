package Aula3;

public class Aluno {
    //Atributos
    private String ra;
    private String nome;
    private String curso;
    
    //métodos acessores e modificadores
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRa(){
        return this.ra;
    }
    
    public void setRa(String ra){
        this.ra = ra;
        
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
}
