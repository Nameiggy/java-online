package Box;

class Chocolate extends BoxOfSweets {


    public Chocolate(String name, double weight, double price) {
        super(name, weight, price);

    }

    @Override
    public String uniqueParameter() {
        return "Шоколадный с начинкой";
    }

    @Override
    public String getUniqueParameter() {
        return "Шоколадный с начинкой";
    }
}

