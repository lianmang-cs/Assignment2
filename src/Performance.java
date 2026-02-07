public class Performance {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;

        SortingAlgorithms sort_alg= new BubbleSort();

        Tester test = new Tester(sort_alg);

    }
}
