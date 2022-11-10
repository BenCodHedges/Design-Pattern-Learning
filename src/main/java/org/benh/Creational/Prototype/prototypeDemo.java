package org.benh.Creational.Prototype;

public class prototypeDemo {
    public static void main(String[] args) {
        Spaceship round = new  Spaceship("Round", 7, 14.2);
        System.out.println(round);

        Spaceship clone1 = (Spaceship) round.createClone();
        Spaceship clone2 = (Spaceship) round.createClone();
        Spaceship clone3 = (Spaceship) round.createClone();

        clone1.setName("Cube");
        clone2.setName("Pyramid");
        clone3.setName("Box");

        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
    }
}
