package Staff;

abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String position;
    protected String specialSkills;

    public Employee(String firstName, String lastName, int age, String position, String specialSkills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.specialSkills = specialSkills;
    }

    public abstract void work();
    public abstract int getLunchTime();

    public void comeToWork() {
        System.out.println(firstName + " " + lastName + " пришел на работу.");
    }

    public void leaveWork() {
        System.out.println(firstName + " " + lastName + " ушел с работы.");
    }
}