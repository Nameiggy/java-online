package HomWorkPractice;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Igorg {
    public static void main(String[] args) {
        String inputFilePath = "ear/src/main/resources/text.txt"; // Путь к входному файлу
        String outputFilePath = "ear/src/main/resources/text2.txt"; // Путь к выходному файлу

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFilePath));
            int vowelCount = 0;
            int consonantCount = 0;
            StringBuilder modifiedContent = new StringBuilder();

            for (String line : lines) {
                for (char ch : line.toCharArray()) {
                    if (isVowel(ch)) {
                        modifiedContent.append('a');
                        vowelCount++;
                    } else if (isConsonant(ch)) {
                        modifiedContent.append('м');
                        consonantCount++;
                    } else {
                        modifiedContent.append(ch); // Сохраняем символы, которые не являются гласными или согласными
                    }
                }
                modifiedContent.append(System.lineSeparator());
            }

            Files.write(Paths.get(outputFilePath), modifiedContent.toString().getBytes());
            System.out.println("Гласные: " + vowelCount + ", Согласные: " + consonantCount);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isVowel(char ch) {
        return "аеёиоуыэюя".indexOf(Character.toLowerCase(ch)) >= 0;
    }

    private static boolean isConsonant(char ch) {
        return "бвгджзклмнпрстфхцчшщ".indexOf(Character.toLowerCase(ch)) >= 0;
    }
}
