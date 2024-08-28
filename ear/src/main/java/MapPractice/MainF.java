package MapPractice;

import SetPractice.Fruit;

import java.util.HashMap;
import java.util.Map;

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
    }
}

