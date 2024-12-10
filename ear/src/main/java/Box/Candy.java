package Box;

class Candy extends BoxOfSweets {


    public Candy(String name, double weight, double price) {
        super(name, weight, price);

    }

    @Override
    public String uniqueParameter() {
        return "Леденец на палочке";
    }

    @Override
    public String getUniqueParameter() {
        return "Леденец на палочке";
    }
}

