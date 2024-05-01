package ru.itsjava.Exercise;

public class Man implements Talkable{

    @Override
    public void greetingsTalk(){
        System.out.println("Привет как дела?");

    }

    @Override
    public void whatDoYouEat(){
        System.out.println("Что ты ешь на обед?");

    }

    @Override
    public void talk(){
        System.out.println("Привет, здорово");

    }

    @Override
    public void eat(){
        System.out.println("Обычно я пью кофе");
    }






}
