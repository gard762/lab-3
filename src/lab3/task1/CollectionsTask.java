package lab3.task1;

import java.util.*;

public class CollectionsTask {
    public static void main(String[] args){
        int n = 10;
        Random random = new Random();

        Integer[] array = new Integer[n];
        for(int i = 0; i < n; i++){
            array[i] = random.nextInt(101);
        }
        System.out.println("1. Массив: " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("2. Список: " + list);

        Collections.sort(list);
        System.out.println("3. По возрастанию:" + list);

        Collections.reverse(list);
        System.out.println("4. По убыванию: " + list);

        Collections.shuffle(list);
        System.out.println("5. Перемешанный: " + list);

        Collections.rotate(list, 1);
        System.out.println("6. Сдвиг на 1: " + list);

        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("7. Только уникальные: " + uniqueList);

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(Integer num : list)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        List<Integer> duplicateList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > 1)
                duplicateList.add(entry.getKey());
        }
        System.out.println("8. Только дубликаты: " + duplicateList);

        Integer[] newArray = list.toArray(new Integer[list.size()]);
        System.out.println("9. Массив из списка: " + Arrays.toString(newArray));

        System.out.println("10. Частоты: " + freqMap);
    }
}