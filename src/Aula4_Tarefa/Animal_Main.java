package Aula4_Tarefa;

import java.util.Scanner;

public class Animal_Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;
        String nome, tipo;
        int idade;
        Animal animal = null;
        do{
            System.out.println("\n[1] Cadastrar Animal\n[2] Alimentar\n[3] Brincar\n[4] Dormir\n");
            op = scan.nextInt();
            
            switch(op){
                case 1 -> { 
                    System.out.println("Nome: ");
                    nome = scan.next();
                    System.out.println("Tipo: ");
                    tipo = scan.next();
                    System.out.println("Idade: ");
                    idade = scan.nextInt();
                    
                    animal = new Animal(nome, tipo, idade);
                    animal.mostrarStatus();
                }
                case 2 -> {
                    if(animal!=null){
                        animal.alimentar();
                        System.out.println("O animal foi alimentado!");
                        animal.mostrarStatus();
                    } else{
                        System.out.println("O animal precisa estar cadastrado.\n");
                    }
                }
                case 3 -> {
                    if(animal!=null){
                        animal.brincar();
                        System.out.println("O animal brincou!");
                        animal.mostrarStatus();
                        int energia = animal.getEnergia();
                        
                        if(energia<0){
                            System.out.println("O animal morreu!");
                            op = 0;
                        }
                    } else{
                        System.out.println("O animal precisa estar cadastrado.\n");
                    }
                }
                case 4 -> {
                    if(animal!=null){
                        animal.dormir();
                        System.out.println("O animal dormiu!");
                        animal.mostrarStatus();
                    } else{
                        System.out.println("O animal precisa estar cadastrado.\n");
                    }
                }
                default -> System.out.println("Opção Inválida!");
            }
        }while(op!=0);
        
    }
    
}
