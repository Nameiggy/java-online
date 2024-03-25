package ru.itsjava.Person;

import lombok.AllArgsConstructor;

import lombok.Data;
@AllArgsConstructor
@Data

public class Person {
    private String name;
    private int age;




    public void birthday( ) {
        age++;
    }


    public boolean takeBeer() {
        if (age >= 18) {
            return true;
        } else {
            return false;

    }


    }
}
