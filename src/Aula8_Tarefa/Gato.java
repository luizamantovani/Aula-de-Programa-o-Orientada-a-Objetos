package Aula8_Tarefa;

public class Gato extends Animal{
    private int alturaSalto;

    public Gato() {
    }

    public Gato(int alturaSalto, String nome, int idade) {
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }
    
    @Override
    public String imprimir(){
        String str = "===== Gato ====="
                + super.imprimir()
                + "\nAltura do Salto : " + alturaSalto;
        
        return str;
    }
    
    @Override
    public String falar(){
        String str = "Miau";
        return str;
    }
}
