package lab3.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrimesGenerator implements Iterable<Integer>{
    private final int count;

    public PrimesGenerator(int count){
        this.count = count;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new Iterator<>() {
            private int generated = 0;
            private int current = 1;

            @Override
            public boolean hasNext() {
                return generated < count;
            }

            @Override
            public Integer next() {
                if (!hasNext()) throw new NoSuchElementException();
                while (true) {
                    current++;
                    if (isPrime(current)) {
                        generated++;
                        return current;
                    }
                }
            }

            private boolean isPrime(int num) {
                if (num < 2) return false;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) return false;
                }
                return true;
            }
        };
    }
}