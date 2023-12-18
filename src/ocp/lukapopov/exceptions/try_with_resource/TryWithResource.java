package ocp.lukapopov.exceptions.try_with_resource;

import java.io.FileInputStream;
import java.io.IOException;


class Door implements AutoCloseable{
    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("The door does not close");//second exception => suppressed
    }
}
public class TryWithResource {
    public static void main(String[] args) {

        try (Door d = new Door()) {
            throw new IllegalStateException("Something is wrong");//first exception => caught
        } catch (IllegalStateException e) {
            System.out.println("caught: "+e.getMessage());
            for (Throwable t : e.getSuppressed()) {//this how we can print out suppressed exceptions
                System.out.println("Suppressed: "+t.getMessage());
            }
        }

    }

    /**
     * @implNote Example: method that opens a file, reads the data and closes the file
     */
    public void readFile(){
        FileInputStream is = null;
        try {
            is = new FileInputStream("myFile.txt");//opening the resource
            //read file data
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (is != null) {
                try {
                    is.close();//closing the resource
                }catch(IOException e2){
                    e2.printStackTrace();
                }
            }
        }
    }

    /**
     * @implSpec same thing, but using try-with-resources block
     * @implNote (also known as automatic resource management)
     */
    public void readFile(String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {//opening the resouce
            //read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//the resource closed automatically (implicitly final block)


}

/**
 * @author MuratKutluTuna
 * @implNote Creating custom resource
 */
class MyFileClass implements AutoCloseable{//interface with abstract method close() which has to be implemented
    private final int num;
    public MyFileClass(int num){
        this.num=num;
    }
    @Override//implementation of method close()
    public void close() throws Exception {
        System.out.println("Closing MyFileClass #"+num);
    }

    public static void main(String[] args) {
        //using MyFileClass resource with explicit finally block
        try (MyFileClass bookReader = new MyFileClass(1);
             MyFileClass movieReader = new MyFileClass(2)
        ) {
            System.out.println("try block");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("catch block");
        } finally{
            System.out.println("finally block");
        }
    }
}


