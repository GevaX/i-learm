public class P124E22 {
    public static void main(String[] args) {
        int c = 0;

        for (int i = 1; i <= 300; i++) {
            if (Math.pow( (int) Math.sqrt(i), 2) == i) {
                c++;
            }
        }
        System.out.println("Number of integer square roots between 1 to 300 is " + c);
    }
}
