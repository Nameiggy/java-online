package ru.itsjava.Person;

public class Person1 {
    private String name;
    private int age;


    public Person1(String name, int age) throws AgeNotValidException {
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("Age is not valid");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }






}
