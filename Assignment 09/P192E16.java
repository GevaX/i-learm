public class P192E16  {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void smallerThen(int num) {
        int sumOfDigitsForNum = sumOfDigits(num);
        for (int i = 0; i < num; i++) {
            if (sumOfDigits(i) == sumOfDigitsForNum) {
                System.out.println(i);
            }
        }
    }
}
