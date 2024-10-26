public class P150E24c {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, nth, sum = 1;
        System.out.print(n1);
        while (sum <= 120) {
            System.out.print(", " + n2);
            nth = n1 + n2;
            n1 = n2;
            n2 = nth;
            sum += nth;
        }
    }
}
