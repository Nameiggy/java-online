package ru.itsjava.Object;

import java.io.PrintStream;

public class ObjectPractice {
    public ObjectPractice() {
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2);
        Dog dog1 = new Dog("Maksimys", 4);
        Dog dog3 = new Dog("Maksimys", 4);
        Dog dog2 = new Dog("Lida", 4);
        PrintStream var10000 = System.out;
        boolean var10001 = dog1.equals(dog3);
        var10000.println("dog1.equals(dog3) = " + var10001);
        var10000 = System.out;
        var10001 = dog1.equals(dog2);
        var10000.println("dog1.equals(dog2) = " + var10001);


        System.out.println("dog1.toString() = " + dog1);

    }
}
