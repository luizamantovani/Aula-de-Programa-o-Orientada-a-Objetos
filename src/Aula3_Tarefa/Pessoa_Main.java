package Aula3_Tarefa;

import java.util.Scanner;

public class Pessoa_Main {
    public static void main(String[] args) {
        int op;
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        do{
            System.out.println("[1] Criar Pessoa");
            System.out.println("[2] Mostrar Pessoa");
            System.out.println("[3] Sair");
            
            op = scan.nextInt();
            
            switch(op){
                case 1:
                    String nome, cpf;
                    int idade;
                    char sexo;
                    System.out.println("Digite o nome: ");
                    nome = scan.next();
                    pessoa.setNome(nome);
                    System.out.println("Digite o CPF: ");
                    cpf = scan.next();
                    pessoa.setCPF(cpf);
                    System.out.println("Digite a idade: ");
                    idade = scan.nextInt();
                    pessoa.setIdade(idade);
                    System.out.println("Digite o sexo: ");
                    sexo = scan.next().charAt(0);
                    pessoa.setSexo(sexo);
                    
                    break;
                case 2:
                    System.out.println(pessoa.imprimir());
                    break;
                case 3:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Valor Inválido!");
                    break;
            }
                    
        } while(op!=3);
    }
    
}
