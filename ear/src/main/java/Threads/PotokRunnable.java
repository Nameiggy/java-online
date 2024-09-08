package Threads;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class PotokRunnable implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("\"Поток от класса Runnable:" +i);

        }
    }
}
