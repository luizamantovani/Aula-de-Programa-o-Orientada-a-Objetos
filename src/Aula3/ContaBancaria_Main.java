package Aula3;

public class ContaBancaria_Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.imprimir();
        conta.setId("1");
        conta.depositar(3000);
        conta.sacar(100);
        conta.imprimir();
        conta.sacar(9000);
    }
    
}
