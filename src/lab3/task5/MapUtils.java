package lab3.task5;

import java.util.HashMap;
import java.util.Map;

public class MapUtils{
    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> origMap){
        Map<V, K> swappedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : origMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        return swappedMap;
    }

    public static void main(String[] args){
        Map<String, Integer> original = new HashMap<>();
        original.put("One", 1);
        original.put("Two", 2);
        original.put("Three", 3);

        System.out.println("Оригинал: " + original);

        Map<Integer, String> swapped = swapKeysAndValues(original);
        System.out.println("Обмен: " + swapped);
    }

}