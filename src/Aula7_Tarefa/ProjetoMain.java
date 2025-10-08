package Aula7_Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoMain {

    public static void main(String[] args) {
        ArrayList<Projeto> projetos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int op, idProjeto = 0, idTarefa;
        String nomeProjeto, descricao, status, nomeMembro, cargo;
        char sOuN;

        do {
            System.out.println("""
                               
                               [1] Cadastrar projeto
                               [2] Adicionar Tarefa
                               [3] Adicionar Membro a uma tarefa
                               [4] Lista Projetos
                               [5] Mostra Projeto específico (ID)
                               """);
            op = scan.nextInt();
            scan.nextLine(); 

            switch (op) {
                case 1 -> { 
                    System.out.println("\nNome do projeto: ");
                    nomeProjeto = scan.nextLine();
                    idProjeto = projetos.size() + 1; 
                    Projeto p = new Projeto(idProjeto, nomeProjeto);
                    projetos.add(p);
                    System.out.println("Projeto cadastrado com sucesso!");
                }
                case 2 -> { 
                    System.out.println("\nQual o Projeto (ID): ");
                    idProjeto = scan.nextInt();
                    scan.nextLine();
                    Projeto p = projetos.get(idProjeto - 1);
                    System.out.println(p.print());
                    p.listarTarefas();

                    System.out.println("\nDescrição Tarefa: ");
                    descricao = scan.nextLine();
                    System.out.println("Status Tarefa: ");
                    status = scan.nextLine();
                    idTarefa = p.getTarefas().size() + 1;

                    System.out.println("Adicionar Membro na Tarefa? (S/N): ");
                    sOuN = scan.next().charAt(0);
                    scan.nextLine();

                    if (sOuN == 'S' || sOuN == 's') {
                        System.out.println("Nome do Membro: ");
                        nomeMembro = scan.nextLine();
                        System.out.println("Cargo do Membro: ");
                        cargo = scan.nextLine();
                        Membro m = new Membro(nomeMembro, cargo);
                        p.adicionarTarefa(idTarefa, descricao, m, status);
                    } else {
                        p.adicionarTarefa(idTarefa, descricao, null, status);
                    }

                    System.out.println("Tarefa adicionada com sucesso!");
                }
                case 3 -> { 
                    for (Projeto pro : projetos) {
                        System.out.println(pro.print());
                    }

                    System.out.println("\nQual Projeto (ID): ");
                    idProjeto = scan.nextInt();
                    scan.nextLine();
                    Projeto p = projetos.get(idProjeto - 1);
                    System.out.println(p.print());
                    p.listarTarefas();

                    System.out.println("\nQual Tarefa (ID): ");
                    idTarefa = scan.nextInt();
                    scan.nextLine();
                    Tarefa t = p.getTarefas().get(idTarefa - 1);

                    System.out.println("Nome do Membro: ");
                    nomeMembro = scan.nextLine();
                    System.out.println("Cargo do Membro: ");
                    cargo = scan.nextLine();
                    Membro m = new Membro(nomeMembro, cargo);
                    t.setMembroResponsavel(m);

                    System.out.println("Membro adicionado à tarefa!");
                }
                case 4 -> { 
                    for (Projeto pro : projetos) {
                        System.out.println(pro.print());
                    }
                }
                case 5 -> {
                    System.out.println("\nQual Projeto (ID): ");
                    idProjeto = scan.nextInt();
                    scan.nextLine();
                    Projeto p = projetos.get(idProjeto - 1);
                    System.out.println(p.print());
                    p.listarTarefas();
                }
                default -> System.out.println("Obrigado!");
            }

        } while (op != 0);

        scan.close();
    }
}
