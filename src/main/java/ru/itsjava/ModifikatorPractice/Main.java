package ru.itsjava.ModifikatorPractice;

public class Main {
    public static void main(String[] args) {


            Car bantli = new Car("Bantli", "Black");
            Car moskvich = new Car("Moskvich", "bllue");

        System.out.println("bantli.getPrice() = " + bantli.getPrice());
        System.out.println("moskvich.getPrice() = " + moskvich.getPrice());


        Car.setPrice(4_000);

        System.out.println("bantli.getPrice() = " + bantli.getPrice());
        System.out.println("moskvich.getPrice() = " + moskvich.getPrice());


    }
}
