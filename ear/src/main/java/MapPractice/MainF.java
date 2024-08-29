package MapPractice;

import SetPractice.Fruit;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MainF {
    public static void main(String[] args) {

        // Создаем экземпляр HashMap
        HashMap<String, Fruit> fruitMap = new HashMap<>();

        // 1. Вставка элементов
        // а). Добавляем 5 фруктов
        fruitMap.put("Иван", new Fruit("Яблоко", 1.2));
        fruitMap.put("Мария", new Fruit("Банан", 1.1));
        fruitMap.put("Алексей", new Fruit("Апельсин", 0.6));
        fruitMap.put("Светлана", new Fruit("Киви", 0.4));
        fruitMap.put("Дмитрий", new Fruit("Груша", 0.7));


        // б). В новый экземпляр HashMap добавим старую карту
        HashMap<String, Fruit> newFruitMap = new HashMap<>(fruitMap);

        // 2. Получение элемента по ключу
        Fruit fruitForIvan = newFruitMap.get("Иван");
        System.out.println("Фрукт для Ивана: " + fruitForIvan);

        // 3. Удаление элемента
        newFruitMap.remove("Мария");
        System.out.println("Фрукт для Марии удален.");

        // 4. Проверка на наличие ключа и значения
        String buyerToCheck = "Алексей";
        Fruit fruitToCheck = newFruitMap.get(buyerToCheck);
        if (fruitToCheck != null) {
            System.out.println(buyerToCheck + " имеет фрукт: " + fruitToCheck);
        } else {
            System.out.println(buyerToCheck + " не найден в списке.");
        }

        // 5. Вывод Map на экран
        // a) Вывести все ключи (всех покупателей)
        System.out.println("Все покупатели: " + newFruitMap.keySet());

        // б) Вывести все значения (все фрукты)
        System.out.println("Все фрукты: " + newFruitMap.values());

        // в) Вывести все ключи и значения с помощью entrySet
        System.out.println("Все покупатели и их фрукты:");
        for (Map.Entry<String, Fruit> entry : newFruitMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // Условие на ключ: вернуть количество ключей длина которых больше 5 (покупателей, чье имя больше 5)
        System.out.print("вернуть количество ключей длина которых больше 5:=");
        int count = 0;
        for (String keyNumber : fruitMap.keySet()){
            if (keyNumber.length()>5);
            count++;
        }
        System.out.println(count);


       // Условие на значение: Вернуть количество элементов, которые равны Груша
        System.out.print("Условие на значение: Вернуть количество элементов, которые равны Груша:=");
        int fruitCount= 0;
        for (Fruit element : fruitMap.values()){
            if (element.equals("Груша")){
                fruitCount++;
            }
        }
        System.out.println(fruitCount);

        //Пропустить 2 элемента, значения которых Банан, все остальные вывести.
        System.out.println("Пропустить 2 элемента, значения которых Банан, все остальные вывести.");
        int elemCount = 0;
        for (Fruit fruitElem : fruitMap.values()){
            if (fruitElem.getType().equals("Банан")&& elemCount< 2){
                elemCount++;
            }else {
                System.out.println(fruitElem);
            }
        }
        //Вывести все кроме 2 элементов, ключи которых начинаются на А
        System.out.println("Вывести все кроме 2 элементов, ключи которых начинаются на А");
        int elemCount2 = 0;
        for (Fruit fruits : fruitMap.values()){
            if (fruits.getType().startsWith("А")&& elemCount2<2){
                elemCount2++;
            }else {
                System.out.println(fruits);
            }
        }
        // Возвращаем элемент значение которого яблоко или Яблоко или ЯБЛОко.
        System.out.println("Возвращаем элемент значение которого яблоко или Яблоко или ЯБЛОко");
        for (Fruit elem : fruitMap.values() ){
            if (elem.getType().equals("Яблоко")|| elem.getType().equals("ЯБЛОко") ){
                System.out.println(elem);
                break;
            }
        }
        // Возвращаем все элементы в другую карту, которые являются киви или груша
        System.out.println("Возвращаем все элементы в другую карту, которые являются киви или груша");
        Map<String,Fruit> movedFruits = new HashMap<>();
        movedFruits.putAll(fruitMap);
        System.out.println(movedFruits);
        //Найти средний вес всех фруктов.
        System.out.println("Найти средний вес всех фруктов.");
        double weightCount = 0.0;
        double sumWeight = 0.0;
        for (Fruit value : fruitMap.values()){
            if (value.getWeight()!=0){
                sumWeight += value.getWeight();
                weightCount++;
            }
        }
        System.out.println(sumWeight/weightCount);





    }
}

