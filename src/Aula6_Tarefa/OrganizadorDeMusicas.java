package Aula6_Tarefa;

import java.util.ArrayList;

public class OrganizadorDeMusicas {

    private ArrayList<Faixa> lstFaixas = new ArrayList<>();

    public void adicionarFaixa(String titulo, String artista, int duracao) {
        Faixa faixa = new Faixa(titulo, artista, duracao);
        lstFaixas.add(faixa);
    }

    public void adicionarFaixa(Faixa faixa) {
        lstFaixas.add(faixa);
    }

    public void listarTodasAsFaixas() {
        for (Faixa f : lstFaixas) {
            System.out.println(f.print());
        }
    }

    public void reproduzirFaixa(int indice) {
        if (indice < 0 || indice >= lstFaixas.size()) {
            System.out.println("\nIndice inválido\n");
        } else {
            Faixa faixa = lstFaixas.get(indice);
            faixa.reproduzir();
        }

    }

    public void removerFaixa(int indice) {
         if (indice < 0 || indice >= lstFaixas.size()) {
            System.out.println("\nIndice inválido\n");
        } else {
            lstFaixas.remove(indice);
        }
    }
}
