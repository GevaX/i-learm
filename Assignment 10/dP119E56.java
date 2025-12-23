import unit4.collectionsLib.Node;

class Student {
    private String name;
    private int id;
    private int year;
    private Course[] courses;

    public Student(String name, int id, int year, Course[] courses) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Course[] getCourses() {
        return courses;
    }
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}

class Course {
    private int code;
    private int grade;

    public Course(int code, int grade) {
        this.code = code;
        this.grade = grade;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}

public class dP119E56 {
    // a
    public static void printAverages(Node<Student> as) {
        Node<Student> p = as;
        while (p != null) {
            int sum = 0, avg;
            Course[] courses = p.getValue().getCourses();
            for (int i = 0; i < courses.length; i++) {
                sum += courses[i].getGrade();
            }
            avg = sum / courses.length;
            System.out.printf("Average for %s is %.2f \n", p.getValue().getName(), avg);
            p = p.getNext();
        }
    }

    // b
    public static int highestAverageCourse(Node<Student> as) {
        int grades[] = new int[10];
        int courseTakers[] = new int[10];
        double averages[] = new double[10];

        Node<Student> p = as;
        while (p != null) {
            Course[] courses = p.getValue().getCourses();
            for (int i = 0; i < courses.length; i++) {
                Course c = courses[i];
                grades[c.getCode() - 1] += c.getGrade();
                courseTakers[c.getCode() - 1]++;
                p = p.getNext();
            }
        }
        for (int i = 0; i < averages.length; i++) {
            if (courseTakers[i] > 0) {
                averages[i] = (double) grades[i] / courseTakers[i];   
            }
            else {
                averages[i] = 0;
            }
        }
        double max = -1;
        int maxCourse = -1;
        for (int i = 0; i < averages.length; i++) {
            if (averages[i] > max) {
                max = averages[i];
                maxCourse = i;
            }
        }
        return maxCourse;
    }
    public static void main(String[] args) {
        Node<Student> allStudents;
    }
}
