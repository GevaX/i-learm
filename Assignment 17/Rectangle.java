class Rectangle {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
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

    public double lengthOfSideX() {
        return p2.getX() - p1.getX();
    }

    public double lengthOfSideY() {
        return p2.getY() - p1.getY();
    }

    public double area() {
        return lengthOfSideX() * lengthOfSideY();
    }

    public double perimeter() {
        return lengthOfSideX() * 2 + lengthOfSideY() * 2;
    }

    public String toString() {
        return String.format("Rectangle[(%.2f, %.2f), (%.2f, %.2f)]", 
                          p1.getX(), p1.getY(), 
                          p2.getX(), p2.getY());
    }
}