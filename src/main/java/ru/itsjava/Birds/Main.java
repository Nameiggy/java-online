package ru.itsjava.Birds;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {



        Birds boris = new Crows("Boris","Hello","black", 33);
        System.out.println("boris.getAge() = " + boris.getAge());
        boris.setAge(35);
        System.out.println("boris Age" + boris.getAge());
         boolean B = boris  instanceof Parrot;
        System.out.println(B);


//        Birds fedy = new Parrot("Fedy", "Green");
//        fedy.setParrotName();
//        fedy.setParrotColor();
//        fedy.setParrotInt();
//        System.out.println();
//        fedy.setParrotSay();
//        Birds boris = new Crows("Black crow", "Boris");
//        boris.setCrowsName();
//        boris.setCrowsColor();
//        boris.getCrowsAge();
//        boris.setCrowSay();
//        boris.setParrotInt();
    }
}

