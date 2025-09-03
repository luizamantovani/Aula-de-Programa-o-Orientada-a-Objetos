package Aula4;

public class Pessoa {
    String cpf;
    String nome;
    String carteiraMotorista;
    
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }
    
    public String imprimir(){
        String msn = "CPF: " + cpf +
                "\nNome: " + nome +
                "\nCarteira de Motorista: " + carteiraMotorista;
        
        return msn;
    }
}
