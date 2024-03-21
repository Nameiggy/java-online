package ru.itsjava.Transport;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Car bmw = new Car(255.5F, 1540, "Yellow");
        System.out.println("bmw.getColor() = " + bmw.getColor());
        bmw.setColor("Bllue");
        System.out.println("bmw.getSpeed() = " + bmw.getSpeed());
        bmw.setSpeed(300.2f);
        System.out.println("bmw.getWeight() = " + bmw.getWeight());
        bmw.setWeight(1400);
        System.out.println("bmw.toString() = " + bmw.toString());


        MotorBike ymaha = new MotorBike(305.6F, 900, "Red");
        System.out.println("ymaha.getColor() = " + ymaha.getColor());
        ymaha.setColor("Grey");
        System.out.println("ymaha.getSpeed() = " + ymaha.getSpeed());
        ymaha.setSpeed(309.4f);
        System.out.println("ymaha.getWeight() = " + ymaha.getWeight());
        ymaha.setWeight(892);
        System.out.println("ymaha.toString() = " + ymaha.toString());


    }
}
