import java.util.Scanner;

public class bP54E31 {
    public static Scanner reader = new Scanner(System.in);
    public static int closestSeat(int requestedSeat, boolean[] seats) {
        if (!seats[requestedSeat]) {
            return requestedSeat;
        }

        int distance = 1;
        while (true) {
            int lowerSeat = requestedSeat - distance;
            int upperSeat = requestedSeat + distance;
            
            if (!seats[lowerSeat]) {
                return lowerSeat;
            }
            if (!seats[upperSeat]) {
                return upperSeat;
            }
            distance++;
        }
    } 
    public static void main(String[] args) {
        boolean[] seats = new boolean[200];  // false = unoccupied, true = occupied

        int[] requestedSeats = new int[200];
        for (int i = 0; i < 200; i++) {
            requestedSeats[i] = reader.nextInt(); 
        }

        for (int guest = 0; guest < 200; guest++) {
            int requestedSeat = requestedSeats[guest];
            int assignedSeat = closestSeat(requestedSeat, seats);
            seats[assignedSeat] = true;  

            System.out.println("Guest " + (guest + 1) + " is assigned seat " + (assignedSeat + 1));
        }
    }
}
