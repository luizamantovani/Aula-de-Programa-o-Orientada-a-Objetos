package Aula2;

import java.util.Scanner;

public class Ex2_Main {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um n�mero: ");
        num = scan.nextInt();
        boolean numParOuImpar = par(num);
        
        if(numParOuImpar){
            System.out.println("O n�mero " + num + " � par");
        } else{
            System.out.println("O n�mero " + num + " � impar");
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
