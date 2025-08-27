package Aula3_Tarefa;

public class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;
    
    public void setCPF(String cpf){
        if(cpf==null || cpf.length()!=11){
            System.out.println("O CPF deve conter 11 caract�res");
        } else{
            this.cpf = cpf;
        }       
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSexo(char sexo){
        if(sexo != 'M' && sexo != 'F' && sexo != 'O'){
            System.out.println("G�nero inv�lido!");
        } else{
            this.sexo = sexo;
        }
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public void setIdade(int idade){
        if(idade<0){
            System.out.println("Idade inv�lida!");
        } else{
            this.idade = idade;
        }
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public String imprimir(){
        String texto = "";
        texto += "Nome: " + this.nome;
        texto += "\nCPF: " + this.cpf;
        texto += "\nG�nero: " + this.sexo;
        texto += "\nIdade: " + this.idade;
        
        return texto;
    }
}
