package Aula5;

/**
 *
 * @author luiza
 */
public class Apolice {
   private int numero;
   private String nome;
   private int idade;
   private char sexo;
   private double valorAutomovel;
   
   public Apolice(){
       System.out.println("Objeto inicializado!");
   }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this();
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F'){
           this.sexo = sexo; 
        } else{
            System.out.println("O sexo deve ser M ou F");
        }
        
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
   
    public double calcularValor(){
        if(sexo=='M' && idade<=25){
            return (valorAutomovel*10)/100;
        } else if(sexo=='M' && idade>25){
            return (valorAutomovel*5)/100;
        } else{
            return (valorAutomovel*2)/100;
        } 
    }
    
    public String imprimir(){
        String str = "";
        double valorApolice = calcularValor();
        str += "\nNúmero: " + numero +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nsexo: " + sexo +
                "\nValor Automóvel: " + valorAutomovel +
                "\nValor Apolice: " +  valorApolice;
        return str;
    }
}
