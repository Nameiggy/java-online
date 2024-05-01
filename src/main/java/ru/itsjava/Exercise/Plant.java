package ru.itsjava.Exercise;

public  class Plant extends Cow implements Eatable {




   @Override
   public void eat(){


   }

    @Override
    public void cowTalk() {
        System.out.println("меня ест Cow");

    }

    @Override
    public void meEat(){
        System.out.println(" Im green plant");
    }

}
