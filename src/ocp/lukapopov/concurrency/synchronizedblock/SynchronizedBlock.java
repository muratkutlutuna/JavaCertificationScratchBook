package ocp.lukapopov.concurrency.synchronizedblock;

public class SynchronizedBlock {
    public static void main(String[] args) {
        var lock = new Object(); //lock can be any object (existing or newly created)
        synchronized(lock){
            //code which needs to be executed
            //one thread at a time
        }//synchronized block
    }

//synchronized methods
    //first way
    void doSomething(){
        synchronized(this){//I am synchronizing the object class that I am in (current class (this) is used as a lock)
            //work to be executed one thread at a time
        }
    }

    //alternative
    synchronized void doSomething2(){//method is marked as synchronized
        //work to be executed one thread at a time
    }


}
