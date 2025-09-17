package Aula6;

import java.util.ArrayList;

public class EspacoNave {
    private String nome;
    private ArrayList<Arma> lstArmas = new ArrayList<>();
    
    public void addArma(Arma arma){
        lstArmas.add(arma);
    }
    
    public void addArma(String nome, int dano, String efeito){
        Arma arma = new Arma(nome, dano, efeito);
        lstArmas.add(arma);
    }
    
    public void removeArma(Arma arma){
        lstArmas.remove(arma);
    }
    
    public void removeArma(String nome){
        for(int i =0; i<lstArmas.size(); i++){
            if(lstArmas.get(i).getNome().equals(nome)){
                lstArmas.remove(i);
            }
        }
        
    }
    
    public void atira(String nome){
        for(int i =0; i<lstArmas.size(); i++){
            if(lstArmas.get(i).getNome().equals(nome)){
                lstArmas.get(i).atira();
            }
        }
    }
    
    public void atiraTodas(){
        for(Arma arma : lstArmas){
            arma.atira();
        }
    }
    
    public void listarArmas(){
        for(Arma arma : lstArmas){
            arma.print();
        }
    }
}
