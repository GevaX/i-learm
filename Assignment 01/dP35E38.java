public class dP35E38 {
    public static void mulTable(int a, int b) {
        if (a > 10) {
            return;
        }
        if (b > 10) {
            System.out.println();
            mulTable(a+1, 1);
            return;
        }
        System.out.print(a*b + " ");
        mulTable(a, b+1);
    }
}
