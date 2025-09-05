import java.util.Random;

class ProgramR {
    public static void main(String[] args) {
        Random rand = new Random();
        
        Point p1 = new Point(rand.nextDouble() * 1000, rand.nextDouble() * 1000);
        Point p2 = new Point(rand.nextDouble() * 1000, rand.nextDouble() * 1000);
        Point p3 = new Point(rand.nextDouble() * 1000, rand.nextDouble() * 1000);
        Point p4 = new Point(rand.nextDouble() * 1000, rand.nextDouble() * 1000);

        Rectangle r1 = new Rectangle(p1, p2);
        Rectangle r2 = new Rectangle(p3, p4);

        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 2: " + r2);

        if (r1.area() > r2.area()) {
            System.out.println("Larger Rectangle: " + r1);
        } else {
            System.out.println("Larger Rectangle: " + r2);
        }

        System.out.println("Difference of perimeters: " + Math.abs(r1.perimeter() - r2.perimeter()));
    }
}
