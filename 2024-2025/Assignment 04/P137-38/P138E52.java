public class P138E52 {
    public static void main(String[] args) {
        int digit1, digit2, digit3, digit4;
        for (int i = 1000; i < 10000; i++) {
            digit1 = i / 1000;
            digit2 = (i / 100) % 10;
            digit3 = (i / 10) % 10;
            digit4 = i % 10;     
            if (digit1 == digit3 && digit2 == digit4) {
                System.out.println(i);
            }
        }
    }
}
