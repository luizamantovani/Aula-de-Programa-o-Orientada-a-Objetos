package Aula3;

public class ContaBancaria {
    private String id;
    private double saldo;
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        if(this.saldo-valor<0){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo -= valor;
        }
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void imprimir(){
        System.out.println("Conta: " + this.id + "\nSaldo: " + this.saldo);
    }
}
