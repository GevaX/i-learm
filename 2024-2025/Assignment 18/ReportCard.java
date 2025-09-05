public class ReportCard {
    private String stuName;
    private Subject[] subArray;

    public ReportCard(String stuName, int n) {
        this.stuName = stuName;
        subArray = new Subject[n];
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setSubArray(Subject[] subArray) {
        this.subArray = subArray;
    }

    public String getStuName() {
        return stuName;
    }

    public Subject[] getSubArray() {
        return subArray;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < subArray.length; i++) {
            sum += subArray[i].getGrade();
        }

        return (double) sum / subArray.length;
    }

    public boolean isExcellent() {
        boolean bool = false;

        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i].getGrade() <= 54) {
                return false;
            }
            if (subArray[i].getGrade() == 100) {
                bool = true;
            }
        }
        return bool && average() >= 85;
    }
}
