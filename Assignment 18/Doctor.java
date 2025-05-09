public class Doctor {
    private String name;
    private String specialization;
    private double rate;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.rate = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public String getSpecialization() {
        return specialization;
    }
}
