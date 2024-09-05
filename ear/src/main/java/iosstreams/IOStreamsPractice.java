package iosstreams;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsPractice {
    public static void main(String[] args) {


//        BufferedReader console = new BufferedReader(new  InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("iput="+input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//
//        }
//
//
//


//        try (BufferedReader console = new BufferedReader(new  InputStreamReader(System.in));) {
//            String input = console.readLine();
//            System.out.println("iput="+input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//
//        }

//        File file = new File("ear/src/main/resources/file.txt");
//
//        try (PrintWriter printWriter = new PrintWriter(file)){
//            printWriter.println("stroka1");
//            printWriter.println("stroka2");
//            printWriter.println("stroka3");
//        }catch (FileNotFoundException fileNotFoundException){
//            fileNotFoundException.printStackTrace();
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
//            String input ="";
//            while ((input = reader.readLine()) != null) {
//                System.out.println("reader.Line()=" + input);
//            }
//        }catch (IOException exception){
//            exception.printStackTrace();
//        }
//
        File myfile = new File("ear/src/main/resources/myfile.txt");
        try (PrintWriter printWriter = new PrintWriter(myfile)){
            printWriter.println("Люблю java ");
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();

        }




        List<String> myFileIdea = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(myfile))){

            while ((reader.readLine())!= null) {
                myFileIdea.add("Люблю java");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        System.out.println(myFileIdea);

        File myFile2 = new File("ear/src/main/resources/myFile2.txt");
        try (PrintWriter printWriter = new PrintWriter(myFile2)){
            printWriter.println("Кодинг- это жизнь");

        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }

        List<String> myFileIdea2 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile2))){

            while ((reader.readLine())!= null){
                myFileIdea2.add("Кодинг- это жизнь");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        System.out.println(myFileIdea2);


        FileWriter fileWriter = null;
        try {
            fileWriter= new FileWriter("ear/src/main/resources/myFile2.txt");
            fileWriter.write(String.valueOf(myFileIdea));
        }catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            }catch (IOException exception) {
                exception.printStackTrace();
            }

        }
        FileWriter fileWriter2 = null;
        try {
            fileWriter2= new FileWriter("ear/src/main/resources/myfile.txt");
            fileWriter2.write(String.valueOf(myFileIdea2));
        }catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try {
                fileWriter2.close();
            }catch (IOException exception) {
                exception.printStackTrace();
            }
        }


   }
}
