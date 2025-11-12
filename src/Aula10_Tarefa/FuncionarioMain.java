package Aula10_Tarefa;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FuncionarioMain {

    public static void main(String[] args) {
      
        ArrayList<Funcionario> lstFuncionarios = new ArrayList<>();
        Funcionario a = null;
        Scanner scan = new Scanner(System.in);
        int op = 0;
        char tipo;
        String nome;
        String setor;
        String funcao;
        int numeroCracha;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("\n[1] Criar Funcionario\n[2] Mostrar Funcionarios\n[3] Sair\n"));
            switch(op){
                case 1 -> {
                    tipo = JOptionPane.showInputDialog("\nO funcionario que deseja criar é [H]orista ou [M]ensalista? ").charAt(0);
                    if(tipo != 'H' && tipo != 'h' && tipo != 'm' && tipo != 'M'){
                        JOptionPane.showMessageDialog(null, "\nOPÇÃo INVÁLIDA!!!");
                        break;
                    } 
                    nome = JOptionPane.showInputDialog("Nome: ");
                    setor = JOptionPane.showInputDialog("Setor: ");
                    funcao = JOptionPane.showInputDialog("Função: ");
                    numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Número crachá: "));
                    
                    if(tipo == 'h' || tipo == 'H'){
                        int qntHoras;
                        double valorHora;
                        
                        qntHoras = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas: "));
                        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor hora: "));
                        
                        a = new FuncionarioHorista(qntHoras, valorHora, numeroCracha, nome, setor, funcao);
                        lstFuncionarios.add(a);
                    } else if(tipo == 'm' || tipo == 'M'){
                        double salario;
                        double desconto;
                        
                        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
                        desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto: "));
                        
                        a = new FuncionarioMensalista(salario, desconto, numeroCracha, nome, setor, funcao);
                        lstFuncionarios.add(a);
                    }
                    JOptionPane.showMessageDialog(null, "Funcionário adicionado!");
                }
                case 2 -> {
                    String str = "";
                    for(Funcionario f : lstFuncionarios){
                        str += "\n" + f.toString();
                    }
                    JOptionPane.showMessageDialog(null, str);
                }
                case 3 -> System.out.println("\n===========================");
            }         
        }while(op!=3);
        
        
    }
    
}
