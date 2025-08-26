/*
 Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os
números.
 */
package Aula2_Tarefa;

import java.util.Scanner;


public class Ex5_Main {

    public static void main(String[] args) {
        Ex5_Main.lerVetor();
    }
    public static void lerVetor(){
        int[] num = new int[5];
        Scanner scan = new Scanner(System.in);
        int soma=0, mult=1;
        for(int i=0; i<5; i++){
            System.out.println("Digite o numero: ");
            num[i] = scan.nextInt();
            soma+=num[i];
            mult*=num[i];
        }
        
        System.out.println("Os valores digitados foram: "+ num[0] + num[1] + num[2] + num[3] + num[4]);
        System.out.println("A soma dessas valores é: " + soma);
        System.out.println("O produto desses valores é: " + mult);
    }
}
