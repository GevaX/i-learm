public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public String toString() {
        return String.format("Line[(%.2f, %.2f), (%.2f, %.2f)]", 
                          p1.getX(), p1.getY(), 
                          p2.getX(), p2.getY());
    }

    public double distance() {
        double x1 = p1.getX(), x2 = p2.getX(), y1 = p1.getY(), y2 = p2.getY();

        double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return d;
    }

    public boolean isParallel() {
        return p1.getX() == p2.getX();
    }
}
