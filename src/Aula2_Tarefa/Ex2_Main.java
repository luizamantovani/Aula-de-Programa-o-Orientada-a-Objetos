/*
 Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de
códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
1,2,3,4 = voto para os respectivos candidatos;
5 = voto nulo;
6 = voto em branco;
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;
Como finalizador do conjunto de votos, tem-se o valor 0.
 */
package Aula2_Tarefa;

import java.util.Scanner;

public class Ex2_Main {
    public static void main(String[] args) {
        Ex2_Main.eleicao();
    }
    
    public static void eleicao(){
        Scanner scan = new Scanner(System.in);
        int voto;
        int c1=0, c2=0, c3=0, c4=0, nulo=0, branco=0;
        do{
            System.out.println("Qual o seu voto?\n[1] Candidato 1\n[2] Candidato 2\n[3] Candidato 3\n[4] Candidato 4\n"
                + "[5] Nulo\n[6] Branco\nDigite 0 para finalizar.\n");
            voto = scan.nextInt();
            
        
            switch(voto){
                case 1 -> c1++;
                case 2 -> c2++;
                case 3 -> c3++;
                case 4 -> c4++;
                case 5 -> nulo++;
                case 6 -> branco++;
            }
        } while(voto>0);
        
        System.out.println("Resultado:\nCandidato 1: " + c1 + "\nCandidato 2: " + c2 + "\nCandidato 3: "
                + c3 + "\nCandidato 4: " + c4 + "\nVotos nulos: " + nulo + "\nVotos brancos: " + branco);
    }
}
