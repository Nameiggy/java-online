package Box;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CandyBox box = new CandyBox();
        box.addSweet(new Chocolate("Шоколадка", 200, 50));
        box.addSweet(new Candy("Леденец", 100, 20));
        box.addSweet(new Chocolate("Молочный шоколад", 150, 40));

        System.out.println("Общий вес подарка: " + box.totalWeight());
        System.out.println("Общая стоимость подарка: " + box.totalPrice());
        box.displaySweetsInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите оптимизацию: 1 - по весу, 2 - по цене");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите  вес:");
            double reduceWeight = scanner.nextDouble();
            double newWeight = box.totalWeight() - reduceWeight;
            System.out.println("Вес после уменьшения: " + newWeight);
            box.displaySweetsInfo();
        }else if (choice == 2) {
            System.out.println("Введите  цену:");
            double maxPrice = scanner.nextDouble();
            System.out.println("Сладости под ценой " + maxPrice + ":");
            BoxOfSweets selectedSweet = null;

            for (BoxOfSweets sweet : box.getSweetsUnderPrice(maxPrice)) {
                System.out.println("Название: " + sweet.getName() + ", Вес: " + sweet.getWeight() + ", Цена: " + sweet.getPrice() + ", Уникальный параметр: " + sweet.uniqueParameter());
                // Предложить пользователю выбрать сладость
                System.out.println("Выберите сладость для уменьшения веса (введите название):");
                String userInput = scanner.next();
                if (userInput.equals(sweet.getName())) {
                    selectedSweet = sweet;
                }
            }
            if (selectedSweet != null) {
                // Уменьшаем общий вес на вес выбранного объекта
                double newWeight = box.totalWeight() - selectedSweet.getWeight();
                System.out.println("Вес после уменьшения: " + newWeight);
            } else {
                System.out.println("Сладость не выбрана.");
            }
        } else {
               System.out.println("Неверный выбор.");
        }
    }
}