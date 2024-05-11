package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {

        String name ="Igor";
        String copyName="Igor";
        System.out.println("(name == copyName) = " + (name == copyName));
        // ссылка name и ссылка copyName указывают на один и тот же обьект в куче



        String constructorName = new String("Igor");
        System.out.println("(constructorName == name) = " + (constructorName == name));
        // Сравниваем constructor name с  name и проверяем, ссылка указывает на один и тот же обьект или нет ( В данном случаии нет)

         String internConstructorName = constructorName.intern();
        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));
        // метод intern возвращает строку из пула



        String str = "stroka";
        System.out.println("str.length() = " + str.length());
        //метод вычесляет длину строки

        System.out.println("str.isEmpty() = " + str.isEmpty());
        // проверяет пустая строка или нет
        System.out.println("str.equals(\"Stroka\") = " + str.equals("Stroka"));
        //сравнивает строки
        System.out.println("str.equalsIgnoreCase(\"Stroka\") = " + str.equalsIgnoreCase("Stroka"));
        //игнорирует регистр и сравнивает строки
        String[] strs = str.split( " ");
        System.out.println(strs[0]);
        System.out.println("strs[1] = " +  strs[1]);
        //  метод для получения массива строк
         



    }
}
