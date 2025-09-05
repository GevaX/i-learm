public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String toString() {
        return String.format("p(%f, %f)", x, y);
    }

    public double distance(Point other) {
        double x1 = this.getX(), x2 = other.getX(), y1 = this.getY(), y2 = other.getY();

        double d = Math.sqrt(Math.sqrt(x1-x2) + Math.sqrt(y1-y2));
        return d;
    }
}
