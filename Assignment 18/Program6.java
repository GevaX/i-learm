public class Program6 {
    public static void theWinner(Vote[] votes) {
        int[] cans = new int[40];

        for (int i = 0; i < votes.length; i++) {
            cans[votes[i].getFirst() - 1] += 7;
            cans[votes[i].getSecond() - 1] += 5;
            cans[votes[i].getThird() - 1] += 1;
        }

        int max = 0, maxI = -1;
        for (int i = 0; i < cans.length; i++) {
            if (cans[i] > max) {
                max = cans[i];
                maxI = i;
            }
        }
        System.out.println("Wining song is " + (maxI + 1));
    }
}
