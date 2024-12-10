package Box;

import java.util.List;

interface SweetBox {
    void addSweet(BoxOfSweets sweet);
    void removeSweet(int index);
    void removeLastSweet();
    double totalWeight();
    double totalPrice();
    void optimizeWeight(double maxWeight);
    void optimizePrice(double maxWeight);
    void displaySweetsInfo();
    void optimizeBox(double maxWeight);
    List<BoxOfSweets> getSweetsUnderPrice(double maxPrice);
}
