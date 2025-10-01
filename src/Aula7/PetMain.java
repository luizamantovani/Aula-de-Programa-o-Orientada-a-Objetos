package Aula7;

public class PetMain {

    public static void main(String[] args) {
        Tutor t1 = new Tutor("Luiza", "48250026845");
        Pet p1 = new Pet("lili", "Cachorro", 1);
        Pet p2 = new Pet("lala", "Gato", 4);
        t1.addPet(p1);
        t1.addPet(p2);
        
        t1.imprimir();
    }
    
}
