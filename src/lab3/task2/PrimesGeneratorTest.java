package lab3.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesGeneratorTest {
    public static void main(String[] args){
        int n = 10;
        PrimesGenerator generator = new PrimesGenerator(n);

        System.out.println("Первые " + n + " простых чисел (прямой порядок):");
        for (Integer prime : generator) {
            System.out.print(prime + " ");
        }
        System.out.println();

        List<Integer> primesList = new ArrayList<>();
        Iterator<Integer> it = generator.iterator();
        while (it.hasNext()) {
            primesList.add(it.next());
        }

        System.out.println("Те же числа в обратном порядке:");
        for (int i = primesList.size() - 1; i >= 0; i--) {
            System.out.print(primesList.get(i) + " ");
        }
        System.out.println();
    }
}