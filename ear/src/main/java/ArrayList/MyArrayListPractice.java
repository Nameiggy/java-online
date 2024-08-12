package ArrayList;

public class MyArrayListPractice {
    public static void main(String[] args) {


        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("Privet");
        list.add("Poca");
        System.out.println("Posle dobavlenui" + list.size());
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");
        list.add("Privet");

        System.out.println(list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains() = " + list.contains(list));
        list.clear();
        // 1 Test
        System.out.println("Тест 1 (должно быть true): " + list.isEmpty());
        // 2 Test
        System.out.println("(Тест 2 false,если коллекция содержит о ) :" +list.contains(list));
        // 3 Test
        System.out.print("Тест 3, (удаляект всю колекцию):");
       list.clear();


    }
}
