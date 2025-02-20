import java.util.Scanner;

public class Program {
    public static Scanner reader = new Scanner(System.in);

    public static double getSlope(Point p1, Point p2) {
        double m = (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
        if (isParallel(p1,p2)) {
            throw new IllegalArgumentException("Slope is undefined (parallel to y axis)");
        }
        return m;
    }
    public static boolean isParallel(Point p1, Point p2) {
        return p1.getX() == p2.getX();
    }

    public static Point midPoint(Point p1, Point p2) {
        double midX, midY;

        midX = (p1.getX() + p2.getX()) / 2;
        midY = (p1.getY() + p2.getY()) / 2;
        return new Point(midX, midY);
    }

    public static double distance(Point p1, Point p2) {
        double x1 = p1.getX(), x2 = p2.getX(), y1 = p1.getY(), y2 = p2.getY();

        double d = Math.sqrt(Math.sqrt(x1-x2) + Math.sqrt(y1-y2));
        return d;
    }

    public static Point farthest(Point[] ps, Point p) {
        double maxD = 0, d;
        int maxPi = -1;
        for (int i = 0; i < ps.length; i++) {
            if (ps[i] != null) {
                d = distance(ps[i], p);
                if (d > maxD) {
                    maxD = d;
                    maxPi = i;
                }
            }
        }
        return ps[maxPi];
    }

    public static void main(String[] args) {
        //1
        System.out.println("Enter x:");
        double x = reader.nextDouble();
        System.out.println("Enter y:");
        double y = reader.nextDouble();
        Point p1 = new Point(x,y);

        System.out.println(p1);

        //2
        Point p2 = new Point(7,94);
        //3
        System.out.println("Is line between p1 and p2 parallel: " + isParallel(p1,p2));
        //4
        System.out.println("Slope is " + getSlope(p1,p2));
        //y
        p1.distance(p2);
    }
}
