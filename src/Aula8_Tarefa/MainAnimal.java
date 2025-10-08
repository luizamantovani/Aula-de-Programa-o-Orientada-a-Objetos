package Aula8_Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        int op=0, opAnimal=0;
        Scanner scan = new Scanner(System.in);
        Cachorro c = null;
        Capivara capi = null;
        Gato g = null;
        ArrayList<Animal> lstAnimais = new ArrayList<>();
        String nome;
        int idade, habilidade;
        
        do{
            System.out.println("\n[1] Cadastrar\n[2] Mostrar Todos\n[3] Animal Falando\n[4] Sair");
            op = scan.nextInt();
            switch(op){
                case 1 -> {
                    System.out.println("""
                                       
                                       Deseja cadastrar qual animal? 
                                       [1] Cachorro
                                       [2] Gato
                                       [3] Capivara""");
                    opAnimal = scan.nextInt();
                    switch(opAnimal){
                        case 1 -> {
                            System.out.println("\nNome: ");
                            nome = scan.next();
                            System.out.println("\nIdade: ");
                            idade = scan.nextInt();
                            System.out.println("\nVelocidade: ");
                            habilidade = scan.nextInt();
                            c = new Cachorro(habilidade, nome, idade);
                            lstAnimais.add(c);
                        }
                        case 2 -> {
                            System.out.println("\nNome: ");
                            nome = scan.next();
                            System.out.println("\nIdade: ");
                            idade = scan.nextInt();
                            System.out.println("\nAltura Salto: ");
                            habilidade = scan.nextInt();
                            g = new Gato(habilidade, nome, idade);
                            lstAnimais.add(g);
                        }
                        case 3 -> {
                            System.out.println("\nNome: ");
                            nome = scan.next();
                            System.out.println("\nIdade: ");
                            idade = scan.nextInt();
                            System.out.println("\nPeso: ");
                            habilidade = scan.nextInt();
                            capi = new Capivara(habilidade, nome, idade);
                            lstAnimais.add(capi);
                        }
                    }
                }
                case 2 -> {
                    for(Animal a : lstAnimais){
                        System.out.println(a.imprimir());
                    }
                    break;
                }
                case 3 -> {
                    for(Animal a : lstAnimais){
                        System.out.println(a.falar());
                    }
                    break;
                }
                case 4 -> {
                    break;
                }
                default -> {
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
                }
            }
        }while(op!=4);
    }
    
}
