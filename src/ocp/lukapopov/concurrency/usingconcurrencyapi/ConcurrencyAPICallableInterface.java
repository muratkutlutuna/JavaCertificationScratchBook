package ocp.lukapopov.concurrency.usingconcurrencyapi;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrencyAPICallableInterface {
    public static void main(String[] args) {
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(() -> 11 * 12);//implementation of call() method
            System.out.println(result.get());//returns integer result
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
    }
}

//how java know if you have passed the implementation for run() or call()?
//It knows because run() doesn't return a value, and call() does.