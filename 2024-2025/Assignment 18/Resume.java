public class Resume {
    private String name;
    private int age;
    private int maxPlaces;
    private JobHistory[] jobs;
    private int counter;
    
    public Resume(String name, int age, int max) {
        this.name = name;
        this.age = age;
        jobs = new JobHistory[max];
    }

    public int getExpirience(String jobType) {
        int sum = 0;
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i].getJobType().equals(jobType)) {
                sum += jobs[i].getYears();
            }
        }

        return sum;
    }

    public String getName() {
        return name;
    }
}
