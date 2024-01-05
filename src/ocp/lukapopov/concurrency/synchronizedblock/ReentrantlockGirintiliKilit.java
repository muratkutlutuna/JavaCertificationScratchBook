package ocp.lukapopov.concurrency.synchronizedblock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantlockGirintiliKilit {
    public static void main(String[] args) {
        //using ReentantLock
        Lock myLock = new ReentrantLock();//creating an instance of lock
        try {
            myLock.lock();
            //work to be executed one thread at a time
        }finally{
            myLock.unlock();
        }
    }
}

//this is equivalent to using synchronized block,
//but it gives you more control over the access


//boolean tryLock() this methods requests lock and returns immediately,
//                  returns boolean indicating if the lock was successfully acquired

//boolean tryLock(      this methods requests lock and blocks for specified time or until lock is required,
//  long Timeout,       returns boolean indicating if the lock was successfully acquired
//  TimeUnit unit)

//if you try to obtain the lock twice, but release it only once, you will create an error
//to make sure to avoid this error use tryLock() in combination with unlock()
//  only if tryLock() returns true, call unlock()