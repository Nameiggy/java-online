package Box;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class CandyBox implements SweetBox {
    private ArrayList<BoxOfSweets> sweets;

    public CandyBox() {
        sweets = new ArrayList<>();
    }

    @Override
    public void addSweet(BoxOfSweets BoxOfSweets) {
        sweets.add(BoxOfSweets);
    }

    @Override
    public void removeSweet(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        }
    }

    @Override
    public void removeLastSweet() {
        if (!sweets.isEmpty()) {
            sweets.remove(sweets.size() - 1);
        }
    }

    @Override
    public double totalWeight() {
        return sweets.stream().mapToDouble(BoxOfSweets::getWeight).sum();
    }

    @Override
    public double totalPrice() {
        return sweets.stream().mapToDouble(BoxOfSweets::getPrice).sum();
    }

    @Override
    public void optimizeWeight(double maxWeight) {
        while (totalWeight() > maxWeight && sweets.size() > 1) {
            sweets.sort(Comparator.comparingDouble(BoxOfSweets::getWeight));
            removeLastSweet();
        }
    }

    @Override
    public void optimizePrice(double maxWeight) {
        while (totalWeight() > maxWeight && sweets.size() > 1) {
            sweets.sort(Comparator.comparingDouble(BoxOfSweets::getPrice));
            removeLastSweet();
        }
    }


    @Override
    public void displaySweetsInfo() {
        for (BoxOfSweets BoxOfSweets : sweets) {
            System.out.println("Название: " + BoxOfSweets.getName() +
                    ", Вес: " + BoxOfSweets.getWeight() +
                    ", Цена: " + BoxOfSweets.getPrice() +
                    ", Уникальный параметр: " + BoxOfSweets.uniqueParameter());
        }
    }



    @Override
    public void optimizeBox(double maxWeight) {
        while (totalWeight() > maxWeight) {
            sweets.sort(Comparator.comparingDouble(BoxOfSweets::getWeight));
            removeLastSweet();
        }
    }
    @Override
    public List<BoxOfSweets> getSweetsUnderPrice(double maxPrice) {
        return sweets.stream()
                .filter(sweet -> sweet.getPrice() >= maxPrice)
                .collect(Collectors.toList());
    }


}




