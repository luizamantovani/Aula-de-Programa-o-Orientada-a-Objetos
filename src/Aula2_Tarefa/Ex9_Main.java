/*
 Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
- a quantidade de pessoas com mais de 90 quilos;
- a média das idades das sete pessoas
 */
package Aula2_Tarefa;

import java.util.Scanner;

/**
 *
 * @author luiza
 */
public class Ex9_Main {
    public static void main(String[] args) {
       Ex9_Main.idadeEPeso(7);
    }
    public static void idadeEPeso(int qnt){
        Scanner scan = new Scanner(System.in);
        int idade, somaIdades=0, pesoMaiorQue90=0;
        double peso;
        for(int i=0; i<qnt; i++){
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            System.out.println("Digite seu peso: ");
            peso = scan.nextDouble();
            somaIdades += idade;
            if(peso>90){
                pesoMaiorQue90++;
            }
        }
        
        System.out.println(pesoMaiorQue90 + " pessoas com mais de 90 kg\nMédia das idades: " + ((double)somaIdades/qnt));
    }
}
