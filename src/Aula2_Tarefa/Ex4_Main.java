/*
 Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem
pares. Termine a leitura se o usuário digitar zero (0)
 */
package Aula2_Tarefa;

import java.util.Scanner;

public class Ex4_Main {
    public static void main(String[] args) {
        System.out.println("O resultado da média é: " + Ex4_Main.mediaPar());
    }
    public static double mediaPar(){
        Scanner scan = new Scanner(System.in);
        int num, aux, count=0;
        double result=0;
        do{
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            
            if(num>0 && num%2==0){
                aux = num;
                result+=aux;
                count++;
            }
        }while(num>0);
        
        return (result/count);
    }
}
