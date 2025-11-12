package Aula11_Tarefa;

public class Carro extends Automovel {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelera() {
        System.out.println("\nO carro acelerou");
    }

    @Override
    public void freia() {
        System.out.println("\nO carro freiou");
    }
    
    public void abrirCapo(){
        System.out.println("\nAbriu o capo!");
    }
}
