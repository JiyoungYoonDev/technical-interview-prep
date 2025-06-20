package org.interview;

public class Car extends Vehicle implements Drivable, Fly {
    void move() {
        System.out.println("The Car is moving");
    }

    public void fly() {
        System.out.println();
    }

    public void drive() {
        System.out.println();
    }
}
