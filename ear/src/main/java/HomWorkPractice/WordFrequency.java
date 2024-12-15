package HomWorkPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String fileName = "ear/src/main/resources/words.txt";
        try {
            List<String> words = readWordsFromFile(fileName);
            Map<String, Integer> wordCount = countWordFrequency(words);
            printWordStatistics(wordCount);
            findMaxFrequencyWords(wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readWordsFromFile(String fileName) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(fileName)));
        String[] words = content.split("[\\W_]+"); // Разделение по пробелам и знакам препинания
        return Arrays.asList(words);
    }

    private static Map<String, Integer> countWordFrequency(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.toLowerCase(); // Приведение к нижнему регистру
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }

    private static void printWordStatistics(Map<String, Integer> wordCount) {
        List<String> sortedWords = new ArrayList<>(wordCount.keySet());
        Collections.sort(sortedWords);
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }

    private static void findMaxFrequencyWords(Map<String, Integer> wordCount) {
        int maxFrequency = Collections.max(wordCount.values());
        List<String> maxWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxWords.add(entry.getKey());
            }
        }
        System.out.println("Слово(а) с максимальной частотой: " + maxWords + " | Частота: " + maxFrequency);
    }
}

