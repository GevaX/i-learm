public class Subject {
    private String subName;
    private int grade;

    public Subject(String subName, int grade) {
        this.subName = subName;
        this.grade = grade;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSubName() {
        return subName;
    }

    public int getGrade() {
        return grade;
    }
}
