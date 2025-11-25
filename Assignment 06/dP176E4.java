import unit4.collectionsLib.Queue;

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public int compare(Time other) {
        int t1 = 0, t2 = 0;
        t1 += this.hour + this.minute + this.second;
        t2 += other.hour + other.minute + other. second;
        if (t1 == t2) return 0;
        if (t1 > t2) return 1;
        else return 2;
    }
    public Time difference(Time other) {
        int t1 = 0, t2 = 0;

        t1 += (this.hour * 60 * 60) + (this.minute * 60) + this.second;
        t2 += (other.hour * 60 * 60) + (other.minute * 60) + other. second;
        int difference = Math.abs(t1 - t2);
        Time d = new Time(difference / 3600, difference % 3600 / 60, difference % 3600 % 60);
        return d;
    }
}

public class dP176E4 {
    // a
    public static Time differenceFirstAndLast(Queue<Time> times) {
        Time dTime = new Time(0, 0, 0);

        while (!times.isEmpty()) {
            Time e = times.remove();
            dTime.setHour(dTime.getHour() + e.getHour());
            dTime.setMinute(dTime.getMinute() + e.getMinute());
            dTime.setSecond(dTime.getSecond() + e.getSecond());
        }
        return dTime;
    }
    // Time complexity: O(n) because the queue is passed through once.

    // b
    public static int[] sequentialAndSmallestDiffernce(Queue<Time> times) {
        int c = 1, i1 = -1, i2 = -1;
        Time minD = times.head();
        Time prev = times.remove();

        while (!times.isEmpty()) {
            Time e = times.remove();
            Time d = prev.difference(e);
            if (d.compare(minD) == 2) {
                minD = d;
                i1 = c - 1;
                i2 = c;
            }
            c++;
        }
        return new int[]{i1, i2};
    }
}
