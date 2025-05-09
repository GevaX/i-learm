public class PairOfNumbers {
    private int num1;
    private int num2;

    public PairOfNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public boolean isEndStart() {
        int end1 = num1 % 10;
        int end2 = num2 % 10;

        int temp = num1;
        while (temp >= 10) {
            temp /= 10;
        }
        int start1 = temp;

        temp = num2;
        while (temp >= 10) {
            temp /= 10;
        }
        int start2 = temp;

        return start1 == end2 || start2 == end1;
    }
}
