package lab3.task4;

import java.util.Map;
import java.util.HashMap;

public class WordFrequency {
        public static void main(String[] args){
            String text = "Java is a programming language. Java is simple and powerful. " +
                    "Programming in Java is fun.";
            String[] words = text.toLowerCase().split("[^a-zA-Z+]");

            Map<String, Integer> frequencyMap = new HashMap<>();

            for(String word : words){
                if(word == "") continue;
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }

            System.out.println("Частота слов:");
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
}