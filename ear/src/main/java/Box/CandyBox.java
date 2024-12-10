package Box;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class CandyBox implements SweetBox {
    private ArrayList<BoxOfSweets> sweets = new ArrayList<>();

    public void addSweet(BoxOfSweets sweet){
        sweets.add(sweet);
    }

    public void remove(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        }
    }

    public void removeLast() {
        if (!sweets.isEmpty()) {
            sweets.remove(sweets.size() - 1);
        }
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (BoxOfSweets sweet : sweets) {
            totalWeight += sweet.weight;
        }
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (BoxOfSweets sweet : sweets) {
            totalPrice += sweet.price;
        }
        return totalPrice;
    }

    public void showAllSweets() {
        for (BoxOfSweets sweet : sweets) {
            System.out.println(sweet.getDescription());
        }
    }

    public void optimizeWeight(double maxWeight) {
        while (getTotalWeight() > maxWeight && sweets.size() > 1) {
            sweets.sort(Comparator.comparingDouble(s -> s.weight));
            removeLast();
        }
    }

    public void optimizePrice(double maxWeight) {
        while (getTotalWeight() > maxWeight && sweets.size() > 1) {
            sweets.sort(Comparator.comparingDouble(s -> s.price));
            removeLast();
        }
    }


}




