package Aula10_Tarefa;

public class FuncionarioHorista extends Funcionario{
    private int qntHoras;
    private double valorHora;

    public FuncionarioHorista(){};
    public FuncionarioHorista(int qntHoras, double valorHora, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.qntHoras = qntHoras;
        this.valorHora = valorHora;
    }

    public int getQntHoras() {
        return qntHoras;
    }

    public void setQntHoras(int qntHoras) {
        this.qntHoras = qntHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return (qntHoras*valorHora);
    }
    
    @Override
    public String toString(){
        String str = "=============\nNome: " + super.getNome() +
                "\nNúmero Crachá: " + super.getNumeroCracha() +
                "\nSetor: " + super.getSetor() +
                "\nFunção: " + super.getFuncao() +
                "\nSalário: " + calcularSalario();
        return str;
    }
}
