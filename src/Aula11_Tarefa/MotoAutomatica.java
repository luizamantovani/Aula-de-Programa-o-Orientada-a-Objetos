package Aula11_Tarefa;

public class MotoAutomatica extends Moto implements IAutomatico{
    
    public MotoAutomatica(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("\nA marcha da moto mudou automaticamente!");
    }
    
}
