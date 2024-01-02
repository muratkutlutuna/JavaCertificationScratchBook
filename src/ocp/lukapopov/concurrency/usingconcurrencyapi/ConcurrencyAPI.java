package ocp.lukapopov.concurrency.usingconcurrencyapi;

import java.util.concurrent.*;
public class ConcurrencyAPI {
    public static void main(String[] args) {

        // single-thread executer
        ExecutorService service = Executors.newSingleThreadExecutor();

        Thread thread1 = new Thread(()->{
            for (int i = 2; i <= 10_000_000; i+=2) {
                System.out.println("thread1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }});
        Thread thread2 = new Thread(()->{
            for (int i = 2; i <= 10_000_000; i+=2) {
                System.out.println("thread2: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }});
        Thread thread3 = new Thread(()->{
            for (int i = 2; i <= 10_000_000; i+=2) {
                System.out.println("thread3: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }});

        service.execute(thread1);//threads are executed one by one
        service.execute(thread2);
        service.execute(thread3);

        service.shutdown();//if omitted, the program will never end



    }
}
