// PEOPLE

class Person {
    private static int nextId = 1;
    private static int peopleCount = 0;

    protected String name;
    private int id;

    public Person(String name) {
        this.name = name;
        this.id = nextId++;
        peopleCount++;
    }

    public static int getPeopleCount() {
        return peopleCount;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class Student extends Person {
    private String studentClass;
    private double average;

    public Student(String name, String studentClass, double average) {
        super(name);
        this.studentClass = studentClass;
        this.average = average;
    }

    @Override
    public String toString() {
        return super.toString() + ", Class: " + studentClass + ", Average: " + average;
    }
}

class Teacher extends Person {
    private String profession;
    private double salary;

    public Teacher(String name, String profession, double salary) {
        super(name);
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profession: " + profession + ", Salary: " + salary;
    }
}

// SHAPES

class Shape {
    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Calculate area without height using Heron's Formula
    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        // School people
        Student s1 = new Student("Alice", "10A", 92.5);
        Student s2 = new Student("Bob", "10B", 88.0);

        Teacher t1 = new Teacher("Mr. Smith", "Math", 4500);
        Teacher t2 = new Teacher("Ms. Johnson", "English", 4200);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("Total people: " + Person.getPeopleCount());

        // Shapes
        Shape c = new Circle(5);
        Shape r = new Rectangle(8, 4);
        Shape tr = new Triangle(6, 8, 10);

        System.out.println("Circle area: " + c.area() + ", perimeter: " + c.perimeter());
        System.out.println("Rectangle area: " + r.area() + ", perimeter: " + r.perimeter());
        System.out.println("Triangle area: " + tr.area() + ", perimeter: " + tr.perimeter());
    }
}
