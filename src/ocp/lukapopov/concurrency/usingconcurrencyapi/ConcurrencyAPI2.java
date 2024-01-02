package ocp.lukapopov.concurrency.usingconcurrencyapi;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrencyAPI2 {
    static int count;
    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<?>result = service.submit(()->{
            for (int i = 0; i < 10_000_000; i++) count++;});
        //a process which takes several miliseconds to complete

        try {
            var value = result.get(1, TimeUnit.MILLISECONDS);// result of the task after 1 ms
            if (value == null) {
                System.out.println("Task comleted.");
            }
        } catch (TimeoutException e) {
            System.out.println("Task didn't complete in time.");//task was not completed in 1 ms
        }catch(InterruptedException|ExecutionException e){
            e.printStackTrace();
        }

        service.shutdown();
    }


}


