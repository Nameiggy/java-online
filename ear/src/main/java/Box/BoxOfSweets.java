package Box;



    abstract class BoxOfSweets {
        private String name;
        private double weight;
        private double price;

        public BoxOfSweets(String name, double weight, double price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }


    public abstract String uniqueParameter();


        public abstract String getUniqueParameter();
    }
