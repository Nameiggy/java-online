package HomWorkPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser {

    public static void main(String[] args) {
        String fileName = "ear/src/main/resources/production_log.csv";
        Map<String, Map<String, Integer>> apiUsage = new HashMap<>();

        // Модифицированное регулярное выражение для парсинга логов
        Pattern logPattern = Pattern.compile("(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}):\\d{2}\\.\\d+\\+\\d{2}:\\d{2}~\\w+\\s\"(/api/[a-zA-Z]+)");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = logPattern.matcher(line);

                // Если строка соответствует шаблону
                if (matcher.find()) {
                    String timestamp = matcher.group(1); // Извлекаем дату и время до минуты
                    String apiMethod = matcher.group(2); // Извлекаем метод API

                    // Сохраняем статистику по времени и API-методу
                    apiUsage.putIfAbsent(apiMethod, new HashMap<>());
                    Map<String, Integer> minuteUsage = apiUsage.get(apiMethod);
                    minuteUsage.put(timestamp, minuteUsage.getOrDefault(timestamp, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Рассчитываем пиковую нагрузку для каждого метода
        System.out.println("Пиковая нагрузка по каждому методу:");
        for (Map.Entry<String, Map<String, Integer>> entry : apiUsage.entrySet()) {
            String apiMethod = entry.getKey();
            Map<String, Integer> minuteUsage = entry.getValue();

            // Находим пиковую минуту и количество запросов
            int maxRequests = 0;
            String peakMinute = null;
            for (Map.Entry<String, Integer> minuteEntry : minuteUsage.entrySet()) {
                if (minuteEntry.getValue() > maxRequests) {
                    maxRequests = minuteEntry.getValue();
                    peakMinute = minuteEntry.getKey();
                }
            }

            // Рассчитываем RPS (Requests Per Second)
            double rps = maxRequests / 60.0;

            // Выводим результат
            System.out.printf("Метод: %s, Пиковая минута: %s, Запросов: %d, RPS: %.2f%n",
                    apiMethod, peakMinute, maxRequests, rps);
        }
    }
}