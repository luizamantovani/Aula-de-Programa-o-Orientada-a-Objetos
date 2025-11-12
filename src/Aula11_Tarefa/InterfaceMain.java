package Aula11_Tarefa;

import java.util.ArrayList;

public class InterfaceMain {
    public static void main(String[] args) {
        ArrayList<IAutomatico> lstAutomaticos = new ArrayList<>();
        ArrayList<IVoa> lstVoa = new ArrayList<>();
        
        CarroAutomatico ca = new CarroAutomatico("Honda", "Fit", 2012);
        lstAutomaticos.add(ca);
        MotoAutomatica ma = new MotoAutomatica("Honda", "CG 160 Start", 2020);
        lstAutomaticos.add(ma);
        Aviao a = new Aviao("Boeing 777 ");
        lstAutomaticos.add(a);
        lstVoa.add(a);
        Morcego m = new Morcego("Myotis nigricans");
        lstVoa.add(m);
                
        for(IAutomatico ia : lstAutomaticos){
            ia.mudaMarchaAutomaticamente();
        }
        for(IVoa iv : lstVoa){
            iv.voar();
        }
    }
    
}
