package Aula6_Tarefa;

import java.util.Scanner;

public class Faixa_Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OrganizadorDeMusicas musicas = new OrganizadorDeMusicas();
        int op;
        String titulo, artista;
        int duracao, indice;
        do {
            System.out.println("[1] Adicionar Faixa\n[2] Remover Faixa\n[3] Reproduzir faixa\n"
                    + "[4] Listar Todas as faixas\n[5] Sair\n");
            op = scan.nextInt();

            switch (op) {
                case 1 -> {
                    scan.nextLine();
                    System.out.println("\nTitulo: ");
                    titulo = scan.nextLine();
                    System.out.println("\nArtista: ");
                    artista = scan.nextLine();
                    System.out.println("\nDuração: ");
                    duracao = scan.nextInt();
                    musicas.adicionarFaixa(titulo, artista, duracao);
                    System.out.println("\nFaixa Adicionada!\n");
                }
                case 2 -> {
                    System.out.println("\nIndice da faixa a ser removida: ");
                    indice = scan.nextInt();
                    musicas.removerFaixa(indice);
                    break;
                }
                case 3 -> {
                    System.out.println("\nIndice da faixa a ser reproduzida: ");
                    indice = scan.nextInt();
                    musicas.reproduzirFaixa(indice);
                    break;
                }
                case 4 ->{
                    musicas.listarTodasAsFaixas();
                    break;
                }
                case 5 -> {
                    break;
                }
                default ->
                    System.out.println("\nOpção Inválida!!!\n");
            }
        } while (op != 5);
    }

}
