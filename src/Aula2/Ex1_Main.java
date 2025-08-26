package Aula2;

import java.util.Scanner;

public class Ex1_Main {
    public static void main(String[] args) {

        String texto = Ex1_Main.calculadora();
        
        System.out.println(texto);
    }
    
    public static String calculadora(){
        Scanner scan = new Scanner(System.in);
        double result = 0;
        double valor1, valor2;
        
        String op;
        System.out.println("Adicione o primeiro valor: ");
        valor1 = scan.nextDouble();
        System.out.println("Adicione o operador: ");
        op = scan.next();
        System.out.println("Adicione o segundo valor: ");
        valor2 = scan.nextDouble();
        switch(op){
            case "+" -> result = valor1 + valor2;
            case "-" -> result = valor1 - valor2;
            case "*" -> result = valor1 * valor2;
            case "/"-> result = valor1 / valor2;
        }
        String textoResultado = valor1 + " " + op + " " + valor2 + " = " + result;
        return textoResultado;
    }
}
