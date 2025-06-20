package org.interview;

public class Sedan extends Car implements Drivable{
    // overrloading
    // overriding
    public void drive() {
        System.out.println("The car is driving");
    }

    void openTrunk() {
        System.out.println("Trunk is open");
    }

    // overriding
    @Override
    void move() {
        System.out.println("MOVE 1");
    }

    // over loading
    void move(int data) {
        System.out.println("MOVE 2");
    }

}
