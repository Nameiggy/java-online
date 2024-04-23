package ru.itsjava.interfaces;

public class Dogs implements Runnable {
    @Override
    public void run(){
        System.out.println("его скорость состовляет ");

    }

    @Override
    public int maxRunDistance(){
        return 45;

    }


}
