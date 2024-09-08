package Threads;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Message extends Thread{
    private final String message;
    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            Thread.sleep(delay);
            System.out.println(message);

        }
    }
}
