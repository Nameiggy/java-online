package Threads.lectur4;

import lombok.SneakyThrows;


public class RunnablePractice {
    public static void main(String[] args) {




        Runnable runnable1 = () -> System.out.println("Привет я Runnable");
        new Thread(runnable1).start();



        Runnable runnable = () -> {
            for (int i = 0; i <1 ; i++) {

            }try {
                Thread.sleep(4000L);
                System.out.println("Привет я проснулся после 4 секунд");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();



    }
}
