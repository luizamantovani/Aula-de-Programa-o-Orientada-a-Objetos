package Aula5;

import java.util.Scanner;

/**
 *
 * @author luiza
 */
public class Vendedor_Main {
    public static void main(String[] args) {
       int op=0;
       Scanner scan = new Scanner(System.in);
       Vendedor vendedor = null;
       int cod;
       String nome;
       double percentual, valor, desconto;
       do{
           System.out.println("\n[1] Cadastrar Vendedor\n[2] Calcular Venda\n[3] Sair\n");
           op = scan.nextInt();
           
           switch(op){
               case 1 -> {
                   System.out.println("\nCodigo: ");
                   cod = scan.nextInt();
                   scan.nextLine();
                   System.out.println("\nNome: ");
                   nome = scan.nextLine();
                   System.out.println("\nPercentual de Comissão: ");
                   percentual = scan.nextDouble();
                   vendedor = new Vendedor(cod, nome, percentual);
               }
               case 2 -> {
                   if(vendedor == null){
                       System.out.println("\nCadastre um vendedor!");
                   } else{
                       System.out.println("\nValor de Venda: ");
                       valor = scan.nextDouble();
                       scan.nextLine();
                       System.out.println("\nDesconto: ");
                       String entrada = scan.nextLine();
                       
                       if(entrada.isEmpty()){
                           System.out.println(vendedor.imprimir(valor));
                       } else{
                           desconto = Double.parseDouble(entrada);
                           System.out.println(vendedor.imprimir(valor, desconto));
                       }
                   }
               }
               case 3 -> System.out.println("\nFinalizado!");
               default -> System.out.println("Opção Inválida!");
                   
           }     
       }while(op!=3);
    }
    
}
