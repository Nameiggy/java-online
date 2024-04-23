package ru.itsjava.interfaces;

public class Interfacespractice {
    public static void main(String[] args) {

        Walkable human = new Man();
        human.walk();
        Swimable nemo = new Fish();
        nemo.swim();
        nemo.maxSwimSpeed();
        Runnable rex = new Dogs();
        rex.run();
        rex.maxRunDistance();
        Flyable orel = new Bird();
        orel.fly();
        orel.flyMaxDistance();



    }
}
