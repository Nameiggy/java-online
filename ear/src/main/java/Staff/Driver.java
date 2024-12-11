package Staff;

class Driver extends Employee {
    public Driver(String firstName, String lastName, int age, String specialSkills) {
        super(firstName, lastName, age, "Водитель", specialSkills);
    }

    @Override
    public void work() {
        System.out.println(firstName + " " + lastName + " выполняет свои обязанности: управляет транспортом.");
    }

    @Override
    public int getLunchTime() {
        return 40; // 40 минут
    }
}

