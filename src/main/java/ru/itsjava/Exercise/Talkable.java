package ru.itsjava.Exercise;

public interface Talkable {
    void talk();
    void eat();

   default void greetingsTalk(){
       System.out.println("Привет как дела?");
   }
    default void whatDoYouEat(){
        System.out.println("Что ты ешь на обед?");

    }
}
