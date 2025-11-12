package Aula11_Tarefa;

public class CarroAutomatico extends Carro implements IAutomatico{
    
    public CarroAutomatico(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    
    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("\nA marcha do carro mudou automaticamente!");
    }
    
}
