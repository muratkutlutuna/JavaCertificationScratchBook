package ocp.lukapopov.io.serialization;

import java.io.*;

public class SerializationExample {
    public static void serialize(Object object, String fileName)throws IOException {

        try(var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
            out.writeObject(object);
        }

    }

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException{
        try(var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))){
            return in.readObject();
        }
    }

    public static void main(String[] args) {
        User user = new User("John Wayne", "mySuperSecretPassword");

        try {
            //Serialize the user object to a file user.ser
            serialize(user, "user.ser");

            //deserialize the user object from the file
            User deserializedUser = (User)deserialize("user.ser");
            System.out.println(deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
