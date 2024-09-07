package iosstreams;

import java.io.*;

public class serializablePractice {
    public static void main(String[] args) {
                      // Сериализация
//        User user = new User("Vitalik", 230596);
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("ear/src/main/resources/user.user"))){
//            objectOutputStream.writeObject(user);
//
//        }catch (IOException exception){
//            exception.printStackTrace();
//        }

        // Десериализация
        User deserializedUser = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("ear/src/main/resources/user.user"))){
            deserializedUser = (User)
            inputStream.readObject();

        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
        System.out.println("Login = " + deserializedUser.login);
        System.out.println("Password = " + deserializedUser.password);


    }
}
