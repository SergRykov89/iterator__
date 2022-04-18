import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;

    }


    @Override
    public Iterator iterator() {
        return new Iterator(min) {

        };

    }

    class Iterator implements java.util.Iterator<Integer> {
        int current;

        public Iterator(int current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current <= max;
        }

        @Override
        public Integer next() {
            random = new Random();
            return random.ints(min, max + 1).findFirst().getAsInt();

        }
    }
}
