package Aula7;

import java.util.ArrayList;

public class Tutor {
    private String nome;
    private String cpf;
    private ArrayList<Pet> lstPets;

    public Tutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        lstPets = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void addPet(Pet pet){
        lstPets.add(pet);
    }
    
    public void imprimir(){
        System.out.println("\nTutor: " + this.nome + "\nCPF: " + this.cpf);
        for(Pet p : lstPets){
            System.out.println("\nNome: "+ p.getNome()+ "\nRaça: " + p.getRaca() + "\nIdade: " + p.getIdade());
        }
    }
}
