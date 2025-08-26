package Aula2_Tarefa;

import java.util.Scanner;

/*Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos. O
final da leitura acontecerá quando for lido um valor negativo.*/
public class Ex1_Main {
    public static void main(String[] args) {
        System.out.println("O resultado da média aritmética é: " + Ex1_Main.media());
    }
    public static double media(){
        Scanner scan = new Scanner(System.in);
        double num=0, aux=0;
        int count=0;
        double result=0;
        do{
            System.out.println("Digite um valor: ");
            num = scan.nextDouble();
            if(num>=0){
                aux=num;
                count++;
                result += aux;
            }
            
        } while(num>=0);
        
        return (result/count);
    }
}
