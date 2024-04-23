package ru.itsjava.interfaces;

public class Bird implements Flyable{

    @Override
    public void fly(){
        System.out.println("this bird flies very");

    }
    @Override
    public String flyMaxDistance(){

        return "high pallet";
    }


}
