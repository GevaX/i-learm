public class Vote {
    private int first;
    private int second;
    private int third;

    public Vote(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }
}
