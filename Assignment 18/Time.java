public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }

        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
        else {
            this.minute = 0;
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
