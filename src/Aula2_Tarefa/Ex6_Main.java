package Aula2_Tarefa;

import java.util.Scanner;

public class Ex6_Main {

    public static void main(String[] args) {
        lerNumeros(10); 
    }
    
    public static void lerNumeros(int qnt){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[qnt];
        
        int qtdPar = 0, qtdImpar = 0;

        for(int i=0; i<qnt; i++){
            System.out.print("Digite um número: ");
            num[i] = scan.nextInt();
            if(num[i] % 2 == 0){
                qtdPar++;
            } else {
                qtdImpar++;
            }
        }
        
        int[] numPar = new int[qtdPar];
        int[] numImpar = new int[qtdImpar];
        
        int idxPar = 0, idxImpar = 0;
        
        for(int i=0; i<qnt; i++){
            if(num[i] % 2 == 0){
                numPar[idxPar] = num[i];
                idxPar++;
            } else {
                numImpar[idxImpar] = num[i];
                idxImpar++;
            }
        }      
        
        System.out.println("\nVetor completo:");
        for(int i=0; i<qnt; i++){
            System.out.print(num[i] + " ");
        }
        
        System.out.println("\n\nNúmeros pares:");
        for(int i=0; i<numPar.length; i++){
            System.out.print(numPar[i] + " ");
        }
        
        System.out.println("\n\nNúmeros ímpares:");
        for(int i=0; i<numImpar.length; i++){
            System.out.print(numImpar[i] + " ");
        }
    }
}

