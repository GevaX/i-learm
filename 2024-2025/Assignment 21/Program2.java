public class Program2 {
    public static void main(String[] args) throws InterruptedException {
        RobotGame game = new RobotGame(100, 4);
        int winnerIndex = game.playGame();
        Robot winner = game.getRobot(winnerIndex);
        System.out.println("\nGame over! Winner is " + winner.getName() + " at position " + winner.getPosition());
    }
}
