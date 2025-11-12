package Aula11_Tarefa;

public class Aviao implements IAutomatico, IVoa{

    private String modelo;

    public Aviao(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("\nA marcha do avião mudou automaticamente!");
    }

    @Override
    public void voar() {
        System.out.println("\nO avião voa!");
    }
    
}
