public class Student {
    private String name;
    private int[] arrTest = new int[3];

    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < arrTest.length; i++) {
            sum += arrTest[i];
        }

        return (double) sum / arrTest.length;
    }
}
