package ocp.lukapopov.concurrency.usingconcurrencyapi;

import java.util.concurrent.*;

public class ConcurrencyAPISchedulingTasks {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable taskOne = () -> System.out.println("Hello!");

        Callable<String> taskTwo = () -> "Hi!";

        ScheduledFuture<?> resultOne = service.schedule(taskOne, 20, TimeUnit.SECONDS);
        ScheduledFuture<?> resultTwo = service.schedule(taskTwo, 15, TimeUnit.MINUTES);

        //taskOne is scheduled 20 seconds in the future
        //taskTwo is scheduled 15 minutes in the future

    }
}
