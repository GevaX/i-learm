public class TvProgram {
    private int code;
    private int day;
    private boolean isSport;

    public TvProgram(int code, int day, boolean isSport) {
        this.code = code;
        this.day = day;
        this.isSport = isSport;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setSport(boolean isSport) {
        this.isSport = isSport;
    }

    public int getCode() {
        return code;
    }

    public int getDay() {
        return day;
    }

    public boolean getSport() {
        return isSport;
    }
}
