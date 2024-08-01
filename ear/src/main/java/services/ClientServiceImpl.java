package services;

import domain.Client;
import domain.Tea;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{

    private final Client client;
    private final Scanner scanner;
    private final TeaService teaService;


    public void buyTea() {
        System.out.println("Ввидите цвет чая");
        String title = scanner.next();
        if (teaService.hasTea(title)) {
            System.out.println("Покупаем чай");
            teaService.takeTeaByName(title);
            System.out.println("Купили чай");

        }else {
            System.out.println("Не смогли купить чай");
        }


    }

    public void putTea() {
        System.out.println("Ввидите название чая");
        String title = scanner.next();

        System.out.println("Ввидите автора чая");
        String author = scanner.next();
        Tea tea= new Tea(title, author);
        teaService.putTea(tea);

    }

    @Override
    public void getTea() {
        System.out.println("Уважаемый" + client.getName());
        System.out.println("Вот наш выбор");
        teaService.getTea();

    }


}
