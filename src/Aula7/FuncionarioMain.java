package Aula7;


public class FuncionarioMain {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fabio");
        Funcionario f2 = new Funcionario("Helio");
        Funcionario f3 = new Funcionario("Andrea");
        
        f3.addFuncionario(f1);
        f3.addFuncionario(f2);
        f1.setChefe(f3);
    }
    
}
