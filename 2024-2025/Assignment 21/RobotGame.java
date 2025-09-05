import java.util.Random;

public class RobotGame {
    private int size;
    private Robot[] robotArr;
    
    public RobotGame(int size, int robotNum) {
        this.size = size;
        this.robotArr = new Robot[robotNum];

        for (int i = 0; i < robotArr.length; i++) {
            robotArr[i] = new Robot("Robot " + (i + 1), 10);
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Robot[] getRobotArr() {
        return robotArr;
    }

    public Robot getRobot(int index) {
        if (index >= 0 && index < robotArr.length)
            return robotArr[index];
        return null;
    }

    public Robot highestRobot() {
        Robot highest = null;
        int maxPos = -1;
        for (Robot r : robotArr) {
            if (r.isInGame() && r.getPosition() > maxPos) {
                maxPos = r.getPosition();
                highest = r;
            }
        }
        return highest;
    }

    private void turn(int robot) {
        Random rand = new Random();
        int operation = rand.nextInt(4) + 1;
        int n = rand.nextInt(6) + 1;

        switch (operation) {
            case 1:
                robotArr[robot].forward();
                System.out.println("Robot " + robotArr[robot].getName() + " went forward 1 block");
                break;
            case 2:
                robotArr[robot].back();
                System.out.println("Robot " + robotArr[robot].getName() + " went backward 1 block");
                break;
            case 3:
                robotArr[robot].forward(n);
                System.out.println("Robot " + robotArr[robot].getName() + " went forward " + n + " block");
                break;
            case 4:
                robotArr[robot].back(n);
                System.out.println("Robot " + robotArr[robot].getName() + " went backward " + n + " block");
                break;
        }
        for (int i = 0; i < robotArr.length; i++) {
            if (robotArr[robot].getPosition() == robotArr[i].getPosition() && i != robot && robotArr[i].isInGame) {
                robotArr[i].terminate();
                System.out.println("Robot " + robotArr[robot].getName() + " knocked robot " + robotArr[i].getName() + " out.");
            }

        }
    }

    private int updateGame() {
        int latest = -1, num = 0;
        for (int i = 0; i < robotArr.length; i++) {
            if (robotArr[i].getPosition() > 100 || robotArr[i].getPosition() < 1 && robotArr[i].isInGame) {
                System.out.println("Robot " + robotArr[i].getName() + " exceeded the bounds");
                robotArr[i].terminate();
            }
            if (robotArr[i].isInGame) {
                num++;
                latest = i;
            }
            if (robotArr[i].getPosition() == 100) {
                return i;
            }
        }
        if (num == 1) return latest;
        return -1;
    }

    public int playGame() throws InterruptedException {
        int state = -1;
        while (state == -1) {
            for (int i = 0; i < robotArr.length; i++) {
                if (robotArr[i].isInGame) {
                    Thread.sleep(1000);
                    System.out.println("-----------");
                    System.out.println("Robot " + robotArr[i].getName() + " turn");
                    System.out.println("Position: " + robotArr[i].getPosition());
                    turn(i);
                }
                state = updateGame();
            }
        }
        return state;
    }
}
