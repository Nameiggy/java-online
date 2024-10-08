package services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{


    private final ClientService clientService;
    private final Scanner scanner;
    @Override
    public void getMenu() {
        while (true) {
            printMenu();
            System.out.println("Ввидите название чая");
            int menuNum = scanner.nextInt();
            if (menuNum == 1) {
                System.out.println("Вы выбрали купить чай");
                clientService.buyTea();
            }else if (menuNum == 2) {
                System.out.println("Вы должны выбрать цвет чая и автора");
                clientService.putTea();
            }else if (menuNum == 3) {
                System.out.println("Перечень товара");
                clientService.getTea();
            }else {
                System.out.println("До встречи");
                break;
            }
        }


    }
    @Override
    public void printMenu() {
        System.out.println("1- Купить; 2-Выбрать чай; Все остальное выход");

    }
}
