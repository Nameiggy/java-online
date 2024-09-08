package Threads;

public class Streams {
    public static void main(String[] args) {

      PotokThread potokThread= new PotokThread();
      potokThread.start();

      Thread thread = new Thread(new PotokRunnable());
      thread.start();

      Message message = new Message("Hello World", 5000L);
        System.out.println("Сообщение раз 5 секунд");
      message.start();
    }
}
