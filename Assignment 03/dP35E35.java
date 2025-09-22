public class dP35E35 {
    public static void printBetween(char a, char b) {
        if (a > b) {
            return;
        }
        System.out.print(a + " ");
        printBetween(++a, b);
    }
}
