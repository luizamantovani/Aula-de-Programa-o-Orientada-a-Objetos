package Aula5;

/**
 *
 * @author luiza
 */
public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public Vendedor(){
        System.out.println("Objeto Inicializado!");
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;     
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularPagamentoComissao(double valorVenda){
        return (valorVenda*percentualComissao)/100;
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto){
        return (calcularPagamentoComissao(valorVenda) - desconto);
    }
    
    public String imprimir(){
        String str = "";
        str += "\nCodigo: " + codigo +
                "\nNome: " + nome +
                "\n%Comissão: " + percentualComissao;
        return str;
    }
    
    public String imprimir(double valorVenda, double desconto){
        String str = "";
        str += "\nCodigo: " + codigo +
                "\nNome: " + nome +
                "\n%Comissão: " + percentualComissao+
                "\nDesconto: " + desconto +
                "\nValor a Pagar: " + calcularPagamentoComissao(valorVenda, desconto);
        return str;
    }
    
    public String imprimir(double valorVenda){
        String str = "";
        str += "\nCodigo: " + codigo +
                "\nNome: " + nome +
                "\n%Comissão: " + percentualComissao+
                "\nValor a Pagar: " + calcularPagamentoComissao(valorVenda);
        return str;
    }
}
