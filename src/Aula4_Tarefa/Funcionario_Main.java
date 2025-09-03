package Aula4_Tarefa;

import java.util.Scanner;

public class Funcionario_Main {

    public static void main(String[] args) {
        int op = 0;
        Funcionario funcionario = null;
        
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("[1] Criar Funcion�rio\n[2] Mostrar Folha de Pagamento\n[3] Sair\n");
            op = scan.nextInt();
            
            switch(op){
                case 1 -> {
                    funcionario = new Funcionario();
                    System.out.println("Criar funcion�rio: \n");
                    System.out.println("Crach�: ");
                    funcionario.setCracha(scan.nextInt()); 
                    scan.nextLine();
                    System.out.println("Nome: ");
                    funcionario.setNome(scan.nextLine()); 
                    System.out.println("Tipo de V�nculo ('H' ou 'N'): ");
                    funcionario.setTipoVinculo(scan.next().charAt(0));
                    if(funcionario.getTipoVinculo()=='H'){
                        System.out.println("Valor Hora: ");
                        funcionario.setValorHora(scan.nextFloat());
                        System.out.println("Quantidade de horas: ");
                        funcionario.setQtdeHora(scan.nextFloat());
                    } else{
                        System.out.println("Salario: ");
                        funcionario.setSalario(scan.nextFloat());
                    }
                    System.out.println("Valor desconto: ");
                    funcionario.setValorDesconto(scan.nextFloat());
                    funcionario.imprimir();
                }
                case 2 -> {
                    if(funcionario == null){
                        System.out.println("O funcion�rio deve ser criado primeiro");
                    } else{
                        System.out.println(funcionario.imprimir());
                    }
                }
                case 3 -> System.out.println("Obrigado!");
                default -> System.out.println("Op��o Inv�lida");                    
            }
        }while(op!=3);
    }
    
}
