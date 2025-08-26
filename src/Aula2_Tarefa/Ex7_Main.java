/*
 Uma empresa deseja aumentar seus pre�os em 20%. Fa�a um algoritmo que leia o c�digo e
o pre�o de custo de cada produto e calcule o pre�o novo. Calcule tamb�m, a m�dia dos
pre�os com e sem aumento. Mostre o c�digo e o pre�o novo de cada produto e, no final, as
m�dias. A entrada de dados deve terminar quando for lido um c�digo de produto negativo.
 */
package Aula2_Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luiza
 */
public class Ex7_Main {
    public static void main(String[] args) {
       Ex7_Main.lerProdutos();
    }
    public static void lerProdutos(){
        ArrayList<Double> precosAntigos = new ArrayList<>();
        ArrayList<Double> precosNovos = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        while(true){
            int codigo;
            double preco, precoNovo;
            System.out.println("Digite o c�digo do produto: (negativo se quiser parar)");
            codigo = scan.nextInt();
            if (codigo < 0) {
                break;
            }
            System.out.println("Digite o pre�o atual do produto: ");
            preco = scan.nextDouble();
            precoNovo = preco * 1.2;
            
            precosAntigos.add(preco);
            precosNovos.add(precoNovo);
            
            System.out.println("C�digo: " + codigo + "\nPre�o novo: " + precoNovo);
        }
        calcularMedias(precosAntigos, precosNovos);
    }
    
    public static void calcularMedias(ArrayList<Double> antigos, ArrayList<Double> novos) {
        double somaAntigos = 0, somaNovos = 0;
        
        for (double p : antigos) {
            somaAntigos += p;
        }
        for (double p : novos) {
            somaNovos += p;
        }
        
        double mediaAntigos = !antigos.isEmpty() ? somaAntigos / antigos.size() : 0;
        double mediaNovos = !novos.isEmpty() ? somaNovos / novos.size() : 0;
        
        System.out.println("\n=== Resultados finais ===");
        System.out.println("M�dia dos pre�os antigos: R$ " + mediaAntigos);
        System.out.println("M�dia dos pre�os novos: R$ " + mediaNovos);
    }
    
}
