package ru.itsjava.Exercise;

public interface Eatable {
    void eat();
    void talk();

    default void cowTalk(){
        System.out.println("Мууууу, питается растениеями ");
    }
    default void cowEat(){
        System.out.println("любит есть зеленую траву ");
    }
    default void meEat(){
        System.out.println("green plant");
    }
}
