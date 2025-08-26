package Aula2;

import java.util.Scanner;

public class Ex2_Main {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num = scan.nextInt();
        boolean numParOuImpar = par(num);
        
        if(numParOuImpar){
            System.out.println("O número " + num + " é par");
        } else{
            System.out.println("O número " + num + " é impar");
        }
            
    }
    
    public static boolean par(int num){
        if(num%2==0){
            return true;
        } else{
            return false;
        }
    }
}
