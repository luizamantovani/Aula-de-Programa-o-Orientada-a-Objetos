/*
 Escreva um algoritmo que calcule a m�dia dos n�meros digitados pelo usu�rio, se eles forem
pares. Termine a leitura se o usu�rio digitar zero (0)
 */
package Aula2_Tarefa;

import java.util.Scanner;

public class Ex4_Main {
    public static void main(String[] args) {
        System.out.println("O resultado da m�dia �: " + Ex4_Main.mediaPar());
    }
    public static double mediaPar(){
        Scanner scan = new Scanner(System.in);
        int num, aux, count=0;
        double result=0;
        do{
            System.out.println("Digite um n�mero: ");
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
