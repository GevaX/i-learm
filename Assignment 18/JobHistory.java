public class JobHistory {
    private int  fromYear;
    private int  tillYear;
    private String company;
    private String  jobType;

    public int getYears() {
        return tillYear - fromYear;
    }

    public String getJobType() {
        return jobType;
    }
}
