/*
 Escreva um algoritmo que calcule a m�dia aritm�tica das 3 notas dos alunos de uma classe.
O algoritmo dever� ler, al�m das notas, o c�digo do aluno e dever� ser encerrado quando o
c�digo for igual a zero.
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
            System.out.println("Digite o c�digo do aluno: ");
            ra = scan.nextDouble();
            if(ra>0){   
            System.out.println("Digite a primeira nota: ");
            nota[0] = scan.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota[1] = scan.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota[2] = scan.nextDouble();
            
            System.out.println("C�digo: " + ra + "\nNotas: " + nota[0] + ", " + nota[1] + ", " + nota[2]);
            }
        }while(ra>0);
    }
}
