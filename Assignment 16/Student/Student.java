public class Student {
    private String name;
    private int mat;
    private int cpu;
    private int sport;
    public Student (String name, int mat, int cpu, int sport){
        this.name = name;
        this.mat = mat;
        this.cpu = cpu;
        this.sport = sport;
    }
    public void setMat(int m) {
        this.mat = m;
    }
    public void setCpu(int c) {
        this.cpu = c;
    }
    public void setSport(int s) {
        this.sport = s;
    }
    public String getName() {
        return this.name;
    }
    public int getMat() {
        return this.mat;
    }
    public int getCpu() {
        return this.cpu;
    }
    public int getSport() {
        return this.sport;
    }
    public double getAvg() {
        double avg = (mat + cpu + sport) / 3;
        return avg;
    }
    public String toString() {
        return String.format("Name: %s Math: %d Computer science: %d Sport: %d", name, mat, cpu, sport);
    }
}
