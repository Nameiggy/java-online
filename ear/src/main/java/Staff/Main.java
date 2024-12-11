package Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Cleaner("Иван", "Иванов", 30, "Уборка"));
        employees.add(new Driver("Петр", "Петров", 40, "Вождение"));
        employees.add(new Manager("Светлана", "Сидорова", 35, "Управление"));
        employees.add(new Security("Алексей", "Алексеев", 45, "Охрана"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println((i + 1) + ". " + employees.get(i).firstName + " " + employees.get(i).lastName + " - " + employees.get(i).position);
        }
        System.out.print("Выберите сотрудника по номеру: ");
        int choice = scanner.nextInt() - 1;

        if (choice >= 0 && choice < employees.size()) {
            Employee selectedEmployee = employees.get(choice);
            selectedEmployee.comeToWork();
            selectedEmployee.work();
            System.out.println(selectedEmployee.firstName + " " + selectedEmployee.lastName + " обедает " + selectedEmployee.getLunchTime() + " минут.");
            selectedEmployee.leaveWork();
        } else {
            System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
}

