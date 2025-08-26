/*
 Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe.
O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o
código for igual a zero.
 */
package Aula2_Tarefa;

import java.util.Scanner;

public class Ex3_Main {

    public static void main(String[] args) {
        Ex3_Main.lerNotas();
    }
    
    public static void lerNotas(){
        Scanner scan = new Scanner(System.in);
        double ra=1;
        double[] nota = new double[3];
        do{
            System.out.println("Digite o código do aluno: ");
            ra = scan.nextDouble();
            if(ra>0){   
            System.out.println("Digite a primeira nota: ");
            nota[0] = scan.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota[1] = scan.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota[2] = scan.nextDouble();
            
            System.out.println("Código: " + ra + "\nNotas: " + nota[0] + ", " + nota[1] + ", " + nota[2]);
            }
        }while(ra>0);
    }
}
