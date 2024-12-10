package Box;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        BoxOfSweets marmalade = new Marmalade("Fruit Jelly", 150, 120);
        BoxOfSweets candy = new Candy("Mint Candy", 50, 70);
        BoxOfSweets chocolate = new Chocolate("Dark Chocolate", 200, 250);

        // create sweet-box
        CandyBox  sweetBox = new CandyBox ();

        // add sweets
        sweetBox.addSweet(marmalade);
        sweetBox.addSweet(candy);
        sweetBox.addSweet(chocolate);

        // info after optimization
        System.out.println("Перед оптимизацией:");
        sweetBox.showAllSweets();
        System.out.println("Общий вес: " + sweetBox.getTotalWeight() + "g");
        System.out.println("Общая стоимость: " + sweetBox.getTotalPrice() + "rub");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите оптимизацию: 1 - по весу, 2 - по цене");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Оптимизация по весу
            System.out.println("Введите максимальный вес для оптимизации:");
            double maxWeight = scanner.nextDouble();
            System.out.println("\nПеред оптимизацией оптимизируйте вес до макс " + maxWeight + "g:");
            sweetBox.optimizeWeight(maxWeight);
            sweetBox.showAllSweets();
            System.out.println("Общий вес после оптимизации веса: " + sweetBox.getTotalWeight() + "g");
        } else if (choice == 2) {
            // Оптимизация по цене
            System.out.println("Введите максимальную цену для оптимизации:");
            double maxPrice = scanner.nextDouble();
            System.out.println("\nОптимизация цены для max " + maxPrice + " rub:");
            sweetBox.optimizePrice(maxPrice);
            sweetBox.showAllSweets();
            System.out.println("Общая цена после оптимизации цен: " + sweetBox.getTotalPrice() + "rub");
        } else {
            System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
}