package org.example;

public class Main {

    public static void main(String[] args) {

        Clovek cl=new Clovek();

        Clovek cl2=new Clovek("Pepa","Novak",20);

        System.out.println(cl2.getVek());
        System.out.println(cl2.jmenoPrijmeni());

        System.out.println(cl.getVek());
        System.out.println(cl2.dospelost());

        boolean neniDite = cl2.dospelost();
        if (neniDite)
            System.out.println("je dospelý");
        else
            System.out.println("je to dite");

    }

}
