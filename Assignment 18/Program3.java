import java.util.Random;

public class Program3 {
    public static PairOfNumbers[] generate(int n) {
        PairOfNumbers[] arr = new PairOfNumbers[n];
        Random rand = new Random();
        int count = 0;

        while (count < n) {
            int a = rand.nextInt(1000) + 1;
            int b = rand.nextInt(1000) + 1;
            PairOfNumbers pair = new PairOfNumbers(a, b);
            if (pair.isEndStart()) {
                arr[count] = pair;
                count++;
            }
        }
        return arr;
    }
}
