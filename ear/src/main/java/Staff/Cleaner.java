package Staff;

class Cleaner extends Employee {
    public Cleaner(String firstName, String lastName, int age, String specialSkills) {
        super(firstName, lastName, age, "Уборщик", specialSkills);
    }

    @Override
    public void work() {
        System.out.println(firstName + " " + lastName + " выполняет свои обязанности: убирает помещение.");
    }

    @Override
    public int getLunchTime() {
        return 30; // 30 минут
    }
}

