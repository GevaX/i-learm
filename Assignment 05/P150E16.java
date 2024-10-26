public class P150E16 {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        while (sum < 500) {
            sum += (i*i);
            i++;
        }
        System.out.println("The smallest integer that the sum of (1^2, 2^2.... n^2 = 500) is " + (i-1));
    }
}
