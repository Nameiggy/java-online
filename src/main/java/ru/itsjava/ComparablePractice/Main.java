package ru.itsjava.ComparablePractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {




        Person igor = new Person("Igor","Gresenko", 28);
        Person maxim = new Person("Maxmim", "Popov", 16);
        Person oleg = new Person("Oleg", "Lego", 13);

        System.out.println("igor.compareTo(igor) = " + igor.compareTo(igor));
        System.out.println("maxim.compareTo(maxim) = " + maxim.compareTo(maxim));
        System.out.println("oleg.compareTo(oleg) = " + oleg.compareTo(oleg));


        Person[] people= {igor,maxim,oleg};
        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));
        Arrays.sort(people);
        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));


        Person grisha = new Person("Grisha", "Pavluk", 19);
        Person grisha2 = (Person) grisha.clone();
        System.out.println("First");
        System.out.println("grisha = " + grisha);
        System.out.println("clone");
        System.out.println("grisha2 = "+ grisha2);




    }
}
