/*
 Uma empresa deseja aumentar seus preços em 20%. Faça um algoritmo que leia o código e
o preço de custo de cada produto e calcule o preço novo. Calcule também, a média dos
preços com e sem aumento. Mostre o código e o preço novo de cada produto e, no final, as
médias. A entrada de dados deve terminar quando for lido um código de produto negativo.
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
            System.out.println("Digite o código do produto: (negativo se quiser parar)");
            codigo = scan.nextInt();
            if (codigo < 0) {
                break;
            }
            System.out.println("Digite o preço atual do produto: ");
            preco = scan.nextDouble();
            precoNovo = preco * 1.2;
            
            precosAntigos.add(preco);
            precosNovos.add(precoNovo);
            
            System.out.println("Código: " + codigo + "\nPreço novo: " + precoNovo);
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
        System.out.println("Média dos preços antigos: R$ " + mediaAntigos);
        System.out.println("Média dos preços novos: R$ " + mediaNovos);
    }
    
}
