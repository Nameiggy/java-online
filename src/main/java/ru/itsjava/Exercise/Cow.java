package ru.itsjava.Exercise;

public class Cow implements Eatable{
    @Override

    public void cowTalk(){
        System.out.println("Мууууу, питается растениеями ");
    }

    @Override
    public void cowEat(){
        System.out.println("любит есть зеленую траву ");
    }





    @Override
    public void talk(){
        System.out.println("Myyyyy");


    }
    @Override
    public void eat(){
        System.out.println("all time eat plants");

    }

}
