package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Containers containers1 = new Containers(1,"celular",
                "EUA",true);
        Containers containers2 = new Containers(2,"carros",
                "Argentina",false);
        Containers containers3 = new Containers(3,"computadores",
                "Desconhecido",false);

        Porto porto = new Porto("Porto Verde");

        porto.addConteiner(containers1);
        porto.addConteiner(containers2);
        porto.addConteiner(containers3);

        porto.mostrarConteiners();
        porto.mostrarContainersPerigosos();
    }
}
