package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Porto {
    private String nome;
    private ArrayList<Containers> listaContainers = new ArrayList<>();

    public Porto(String nome) {
        this.nome = nome;
    }

    public void addConteiner(Containers container) {
        listaContainers.add(container);
    }

    public void mostrarConteiners() {
        Collections.sort(listaContainers);
        for (Containers containers: listaContainers){
            System.out.println("Número: " + containers.getNumId() + " Descrição: "+ containers.getDescricao() +
                    " País de origem: " + containers.getPaisOrigem());
        }
    }

    public void mostrarContainersPerigosos() {
        for (Containers container : listaContainers) {
            if (container.isMateriaisPerigosos()) {
                System.out.println("Dados Container Perigoso: " + "Número: " + container.getNumId() +
                        " País de origem: " + container.getPaisOrigem() + "Descrição: " + container.getDescricao());
            }
        }
    }

    public int somaContainersPerigosos(){
        int contador = 0;

        for (Containers containers: listaContainers){
            if (containers.isMateriaisPerigosos() &&
                    containers.isPaisDesconhecido()){
                contador++;
            }
        }
        return contador;
    }

}
