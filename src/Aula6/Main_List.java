package Aula6;

import java.util.ArrayList;

/**
 *
 * @author luiza
 */
public class Main_List {
    public static void main(String[] args) {
        ArrayList<String> lstNomes;
        lstNomes = new ArrayList<>();
        
        lstNomes.add("Luiza");
        lstNomes.add("Maria");
        lstNomes.add("Pedro");
        System.out.println(lstNomes.get(0));
        
        if(lstNomes.contains("Luiza")){
            System.out.println("Essa lista contem meu nome");
        }
    }
    
}
