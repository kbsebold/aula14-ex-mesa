package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Containers containers1 = new Containers(1,"armas de fogo",
                "-",true,true);
        Containers containers2 = new Containers(2,"smartphones",
                "EUA",false,false);
        Containers containers3 = new Containers(3,"carros",
                "Argentina",false,false);
        Containers containers4 = new Containers(4,"cadeiras",
                "EUA",false,true);
        Containers containers5 = new Containers(5,"joias",
                "-",true,true);


        Porto porto = new Porto("Porto Verde");

        porto.addConteiner(containers1);
        porto.addConteiner(containers2);
        porto.addConteiner(containers3);
        porto.addConteiner(containers4);
        porto.addConteiner(containers5);

        porto.mostrarConteiners();
        porto.mostrarContainersPerigosos();
        System.out.println("O total de containers com materiais perigosos de origem " +
                "desconhecida é: " + porto.somaContainersPerigosos());
    }
}
