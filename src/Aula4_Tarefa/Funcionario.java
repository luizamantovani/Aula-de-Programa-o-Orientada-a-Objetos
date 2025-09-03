package Aula4_Tarefa;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        if(tipoVinculo == 'H' || tipoVinculo == 'N'){
            this.tipoVinculo = tipoVinculo;
        } else{
            System.out.println("Valor inválido! (H ou N)");
        }
        
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float calcularSalario(){
        if(this.tipoVinculo=='H'){
            this.salario = (this.valorHora*this.qtdeHora);
            return this.salario;
        } else{
            return this.salario;
        }
    }
    
    public float calcularValorReceber(){
        return (this.calcularSalario()-this.valorDesconto);
    }
    
    public String imprimir(){
        float valorAReceber = calcularValorReceber();
        String msn = "Crachá: " + cracha +
                "\nTipo Vínculo: " + tipoVinculo +
                "\nSalário: " + salario +
                "\nDesconto: " + valorDesconto +
                "\nValor a receber: " + valorAReceber;
        return msn;
    }
}
