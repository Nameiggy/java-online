package ru.itsjava.Exercise;

public class Main {
    public static void main(String[] args) {


        Talkable human = new Man();
        human.greetingsTalk();
        human.whatDoYouEat();
        human.talk();
        human.eat();

        Eatable cow = new Cow();
        cow.cowTalk();
        cow.cowEat();
        cow.talk();
        cow.eat();

        Eatable grass = new Plant();
        grass.cowTalk();
        grass.meEat();







    }
}
