package Aula5;

import java.util.Scanner;

public class Apolice_Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;
        Apolice apolice = null;
        int num, idade;
        String nome;
        char sexo = 'i';
        double valorAut;
        
        do{
            System.out.println("\n[1] Criar apolice\n[2]Ver dados apólice\n[3] Sair");
            op = scan.nextInt();
            
            switch(op){
                case 1 -> {
                    System.out.println("Número: ");
                    num = scan.nextInt();
                    scan.nextLine();
                    System.out.println("\nNome: ");
                    nome = scan.nextLine();
                    System.out.println("\nIdade: ");
                    idade = scan.nextInt();
                    do{
                        System.out.println("\nSexo (M ou F): ");
                        sexo = scan.next().charAt(0);
                    } while(sexo!='M' && sexo != 'F');
                    
                    System.out.println("Valor Automóvel: ");
                    valorAut = scan.nextDouble();
                    apolice = new Apolice(num, nome, idade, sexo, valorAut);
                }
                case 2 -> {
                    if(apolice == null){
                        System.out.println("A Apolice deve ser criada!");
                    } else{
                        System.out.println(apolice.imprimir());
                    }
                }
                case 3 -> System.out.println("Finalizado!");
                default -> System.out.println("Opção inválida!");
            }
        } while(op!=3);

        
    }
    
}
