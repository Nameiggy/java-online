package Staff;

class Manager extends Employee {
    public Manager(String firstName, String lastName, int age, String specialSkills) {
        super(firstName, lastName, age, "Менеджер", specialSkills);
    }

    @Override
    public void work() {
        System.out.println(firstName + " " + lastName + " выполняет свои обязанности: управляет проектами.");
    }

    @Override
    public int getLunchTime() {
        return 60; // 60 минут
    }
}

