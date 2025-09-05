public class P150E18 {
    public static void main(String[] args) {
        int r1, r2, c = 0;
        
        System.out.println("Numbers generated: ");
        int i = 1;
        while (c != 5) {
            r1 = (int)(Math.random() * 6) + 1;
            r2 = (int)(Math.random() * 6) + 1;
            System.out.print(r1 + ", " + r2 + " | ");
            if (r1 == r2) {
                c++;
            }
            i++;
        }
        System.out.println("Number of dice rollings required to reach 5 doubles was " + i);
    }
}
