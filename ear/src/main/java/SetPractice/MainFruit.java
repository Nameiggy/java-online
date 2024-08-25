package SetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainFruit {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Red",14);
        Fruit cherry = new Fruit("white",4);
        Fruit plum = new Fruit("Yellow",10);
        Fruit peach = new Fruit("RedYellow",9);
        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(apple,cherry,plum,peach));
        System.out.println("fruitSet:=" + fruitSet);

        System.out.println("fruitSet.add(apple) = " + fruitSet.add(apple));
        System.out.println("fruitSet:="+fruitSet);


        Fruit apple2 = new Fruit("Apple",14);
        System.out.println("fruitSet.add(apple2) = " + fruitSet.add(apple2));
        System.out.println("fruitSet.contains(apple2) = " + fruitSet.contains(apple2));

        System.out.println("fruitSet.remove(apple2) = " + fruitSet.remove(apple2));
        System.out.println("fruitSet:=" + fruitSet);
        System.out.println("fruitSet.contains(apple2) = " + fruitSet.contains(apple2));


    }
}
