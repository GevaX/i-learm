import java.util.Scanner;

public class P193E20 {
    public static Scanner reader = new Scanner(System.in);
    public static int convertToMinutes(int hours, int minutes) {
        return hours * 60 + minutes;
    }
    public static int calculateTimeDifference(int aHours, int aMinutes, int bHours, int bMinutes) {
        int timeA, timeB;

        timeA = convertToMinutes(aHours, aMinutes);
        timeB = convertToMinutes(bHours, bMinutes);
        return Math.abs(timeA - timeB);
    }
    public static void main(String[] args) {
        int sHours, sMinutes, fHours, fMinutes, difference, max = 0, mDay = -1;

        for (int i = 1; i <= 30; i++) {
            System.out.printf("Enter starting work time (hours and minutes) for day %d:%n", i);
            sHours = reader.nextInt();
            sMinutes = reader.nextInt();
            System.out.printf("Enter ending work time (hours and minutes) for day %d:%n", i);
            fHours = reader.nextInt();
            fMinutes = reader.nextInt();

            difference = calculateTimeDifference(sHours, sMinutes, fHours, fMinutes);
            if (difference > max) {
                max = difference;
                mDay = i;
            }
        }
        System.out.println("Day worked the most is " + mDay);
    }
}
