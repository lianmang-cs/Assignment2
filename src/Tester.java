import java.util.Random;
public class Tester {
    private Random random;
    private SortingAlgorithms sort_alg;
    public Tester(SortingAlgorithms sort_alg) {
          this.sort_alg = sort_alg;
          this.random = new Random();
    }
    public double singleTest(int size) {
        int[] array = new int[size];

        for(int i = 0; i < size;i++) {
            array[i] = random.nextInt();
        }
        long start_time = System.nanoTime();
        sort_alg.sorty(array);
        long end_time = System.nanoTime();
        double time_elapsed = (end_time - start_time) / 1000000.00;
        return time_elapsed;
    }
    public void test(int iteration, int size) {
        double total_time = 0.0;
        for(int i = 0; i < iteration; i++) {
            total_time += singleTest(size);
        }
        double total_average = total_time / iteration;
        System.out.println(total_average + " ms (avg)");
    }
}
