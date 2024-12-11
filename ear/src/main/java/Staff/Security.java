package Staff;

class Security extends Employee {
    public Security(String firstName, String lastName, int age, String specialSkills) {
        super(firstName, lastName, age, "Охранник", specialSkills);
    }

    @Override
    public void work() {
        System.out.println(firstName + " " + lastName + " выполняет свои обязанности: охраняет территорию.");
    }

    @Override
    public int getLunchTime() {
        return 20; // 20 минут
    }
}
