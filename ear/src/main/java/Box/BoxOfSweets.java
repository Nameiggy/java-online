package Box;



    abstract class BoxOfSweets {
        String name;
        double weight;
        double price;

        public BoxOfSweets (String name, double weight, double price){
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

        abstract String getDescription();
    }