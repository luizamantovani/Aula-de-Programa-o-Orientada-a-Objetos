package Aula4;

public class Pessoa_Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("48250026845", "Luiza");
        
        pessoa.setCarteiraMotorista("12345678");
        
        System.out.println(pessoa.imprimir());
    }
    
}
