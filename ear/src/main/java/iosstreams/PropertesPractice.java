package iosstreams;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertesPractice {

    @SneakyThrows
    public static void main(String[] args) {

//        File file= new File("ear/src/main/resources/aplpication.properties");
//
//        Properties prop = new Properties();
//        prop.load(new FileInputStream(file));
//        System.out.println("prop.getProperty(\"key1\") = " + prop.getProperty("key1"));
//
//         ClassLoader classLoader = PropertesPractice.class.getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream("aplpication.properties");
//        Properties propertiesStream = new Properties();
//        propertiesStream.load(inputStream);
//        System.out.println("propertiesStream.getProperty(\"key1\") = " + propertiesStream.getProperty("key1"));


        ClassLoader classLoader1= PropertesPractice.class.getClassLoader();
        InputStream inputStream1 = classLoader1.getResourceAsStream("app.properties");
        Properties properties = new Properties();
        properties.load(inputStream1);
        System.out.println("properties.getProperty(\"key3\" ) = " + properties.getProperty("key3"));
        System.out.println("properties.getProperty(\"key4\") = " + properties.getProperty("key4"));


    }
}
