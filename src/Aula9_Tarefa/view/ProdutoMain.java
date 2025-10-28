package Aula9_Tarefa.view;

import Aula9_Tarefa.entity.Produto;
import Aula9_Tarefa.dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) {
        int op=0, op3=0, qnt=0, id=0;
        char resp='s';
        double valor=0;
        Scanner scan = new Scanner(System.in);
        Produto pro = null;
        ProdutoDAO dao = new ProdutoDAO();
        String nome = "";
        
        do{
            System.out.println("\n[1] Inserir Produto\n[2] Apagar\n[3] Editar\n[4] Listar Todos\n[5] Sair\n ");
            op = scan.nextInt();
            switch(op){
                case 1:
                    System.out.println("\nDigite o nome do produto: ");
                    nome = scan.next();
                    System.out.println("\nDigite a quantidade: ");
                    qnt = scan.nextInt();
                    System.out.println("\nDigite o valor unitário: ");
                    valor = scan.nextDouble();
                    pro = new Produto(nome, qnt, valor);
                    dao.inserir(pro);
                    System.out.println("O produto foi inserido!");
                    break;
                case 2:
                    System.out.println("\nQual o ID do produto que deseja apagar? ");
                    id = scan.nextInt();
                    dao.excluir(id);
                    System.out.println("\nO produto com ID: " + id + " foi excluido!");
                    break;
                case 3:
                    System.out.println("\nQual o ID do produto que deseja modificar? ");
                    id = scan.nextInt();
                    System.out.println("\nDigite o nome do produto: ");
                    nome = scan.next();
                    System.out.println("\nDigite a quantidade: ");
                    qnt = scan.nextInt();
                    System.out.println("\nDigite o valor unitário: ");
                    valor = scan.nextDouble();
                    pro = new Produto(id, nome, qnt, valor);
                    dao.editar(pro);
                    System.out.println("\nO produto com ID: " + id + " foi editado!");
                    break;
                case 4:
                    ArrayList<Produto> lstProdutos = dao.getAll(Produto.class);
                    for(Produto p : lstProdutos){
                        System.out.println(p.imprimir());
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA!!!\n");
                    break;
            }
        } while(op!=5);
    }
    
}
