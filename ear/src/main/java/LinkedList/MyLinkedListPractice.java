package LinkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("Строка 1");
        System.out.println("list = " + list);

        list.add("Строка 2");
        System.out.println("list = " + list);

        list.add("Строка 3");
        System.out.println("list = " + list);

//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Строка 4\") = " + list.contains("Строка 4"));

//        list.remove(1);
//        System.out.println("list = " + list);
//        System.out.println("list.get(0) = " + list.get(0));
//
//        list.set(0, "Privet");
//        System.out.println("list = " + list);

        list.remove("Строка 4");
        System.out.println(list);

        System.out.println("list.indexOf(\"Строка 2\") = " + list.indexOf("Строка 2"));

    }
}
