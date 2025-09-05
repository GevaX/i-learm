public class P137E49 {
    public static void main(String[] args) {
        int digit1, digit2, digit3, sum, c = 0;

        for (int i = 100; i < 1000; i++) {
            digit1 = i / 100;
            digit2 = (i / 10) % 10;
            digit3 = i % 10;
            sum = digit1 + digit2 + digit3;
            if (i % sum == 0) {
                c++;
            }
        }
        System.out.println("Number of 3-digits integers that divide by their sum of digits without reminder is " + c);
    }
}
