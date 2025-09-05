public class P167E14 {
    public static void main(String[] args) {
        int sumOfDivisors, c = 0;
        double sqrt;

        for (int i = 2; i <= 1000; i++) {
            sumOfDivisors = 1;
            sqrt = Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    sumOfDivisors += j;
                    if (j != i / j) {
                        sumOfDivisors += i / j;
                    }
                }
            }
            if (sumOfDivisors == i) {
                c++;
                System.out.println(i);
            }
        }
        System.out.println("Number of perfect numbers between 1 and 1000 is " + c);
    }
}
