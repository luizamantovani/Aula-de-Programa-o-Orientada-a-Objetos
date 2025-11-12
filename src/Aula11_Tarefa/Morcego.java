package Aula11_Tarefa;

public class Morcego extends Animal implements IVoa{
    
    public Morcego(String especie) {
        super(especie);
    }
    
    public void localizarEco(){
        System.out.println("\nO morcego localiza o eco");
    }

    @Override
    public void voar() {
        System.out.println("\nO morcego voa!");
    }
}
