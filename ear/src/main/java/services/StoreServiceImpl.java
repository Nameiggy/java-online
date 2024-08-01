package services;

import domain.Client;
import domain.Tea;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
@Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите ваше имя");
        String clientName = scanner.next();



        Client client = new Client(clientName, new ArrayList<Tea>());


        List<Tea> teaList = new ArrayList<>();
        teaList.add( new Tea("Green", "Бельгийский"));
        teaList.add( new Tea("Black", "Австралийский"));
        teaList.add( new Tea("Black", "Крымский"));
        teaList.add( new Tea("Red", "Липтон"));
        teaList.add( new Tea("White", "Уральский"));

        TeaService teaService = new TeaServiceImpl(teaList);


        ClientService clientService = new ClientServiceImpl(client,scanner,teaService);
        MenuService menuService = new MenuServiceImpl(clientService, scanner);
        menuService.getMenu();

    }

}
