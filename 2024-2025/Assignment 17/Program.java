import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static Scanner reader = new Scanner(System.in);

    public static Line longestLine(Line[] lns) {
        double maxD = 0; int maxI = -1;

        for (int i = 0; i < lns.length; i++) {
            if (lns[i].distance() > maxD) {
                maxD = lns[i].distance();
                maxI = i;
            }
        }
        return lns[maxI];
    }

    public static int numberOfIncludedLines(Point p, Line[] lns) {
        int c = 0;

        for (int i = 0; i < lns.length; i++) {
            if ((Objects.equals(p.toString(), lns[i].getP1().toString())) ||
                    (Objects.equals(p.toString(), lns[i].getP2().toString()))) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Line[] lns = new Line[10];
        // construction
        for (int i = 0; i < lns.length; i++) {
            double x1 = rand.nextDouble() * 1000;
            double y1 = rand.nextDouble() * 1000;
            double x2 = rand.nextDouble() * 1000;
            double y2 = rand.nextDouble() * 1000;

            Point p1 = new Point((int) x1, (int) y1);
            Point p2 = new Point((int) x2, (int) y2);

            lns[i] = new Line(p1, p2);
          }
        // Longest line
        System.out.println(longestLine(lns));
        // Point
        System.out.println(numberOfIncludedLines(new Point(2, 4), lns));
        // How many paralel to y
        int c = 0;
        for (int i = 0; i < lns.length; i++) {
            if (lns[i].isParallel()) {
                c++;
            }
        }
        System.out.println(c);
    }
}
