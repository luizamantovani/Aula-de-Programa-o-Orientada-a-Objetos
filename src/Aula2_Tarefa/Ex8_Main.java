/*
 Foi feita uma pesquisa entre os 1000 habitantes de uma região para coletar os seguintes dados:
sexo (0-feminino, 1-masculino), idade e altura. Faça um algoritmo que leia as informações
coletadas e mostre as seguintes informações:
a) média da idade do grupo;
b) média da altura das mulheres;
c) média da idade dos homens;
d) percentual de pessoas com idade entre 18 e 35 anos (inclusive).
 */
package Aula2_Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luiza
 */
public class Ex8_Main {

    public static void main(String[] args) {
        Ex8_Main.lerDadosPessoais(1000);
    }

    public static void lerDadosPessoais(int qnt) {
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Integer> idadeHomens = new ArrayList<>();
        ArrayList<Double> alturaMulheres = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int genero, idade, entre18e35 = 0;
        double altura;

        for (int i = 0; i < qnt; i++) {
            System.out.println("Qual o seu genero? ");
            genero = scan.nextInt();
            System.out.println("Quanto você tem de altura? ");
            altura = scan.nextDouble();
            System.out.println("Qual é a sua idade? ");
            idade = scan.nextInt();
            idades.add(idade);
            if (genero == 0) {
                alturaMulheres.add(altura);
            } else {
                idadeHomens.add(idade);
            }

            if (idade > 17 && idade < 36) {
                entre18e35++;
            }

        }
        calculaMedias(idades, idadeHomens, alturaMulheres, entre18e35, qnt);
    }

    public static void calculaMedias(ArrayList<Integer> idades, ArrayList<Integer> idadeHomem, ArrayList<Double> alturaMulher, int idade18e35, int qnt) {
        double somaIdade = 0, somaIdadeHomem = 0, somaAlturaMulher = 0;

        for (int p : idades) {
            somaIdade += p;
        }
        for (int p : idadeHomem) {
            somaIdadeHomem += p;
        }

        for (double p : alturaMulher) {
            somaAlturaMulher += p;
        }

        double mediaIdades = !idades.isEmpty() ? somaIdade / idades.size() : 0;
        double mediaIdadeHomem = !idadeHomem.isEmpty() ? somaIdadeHomem / idadeHomem.size() : 0;
        double mediaAlturaMulher = !alturaMulher.isEmpty() ? somaAlturaMulher / alturaMulher.size() : 0;

        System.out.println("\n=== Resultados finais ===");
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Média da idade dos homens: " + mediaIdadeHomem);
        System.out.println("Média da altura das mulheres: " + mediaAlturaMulher);
        double percentual = ((double) idade18e35 / qnt) * 100;
        System.out.println("Porcentagem de pessoas entre 18 e 35 anos: " + percentual + "%");

    }
}
