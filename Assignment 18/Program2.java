public class Program2 {
    public static void printExcellent(ReportCard[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].isExcellent()) {
                System.out.println(array[i].getStuName());
            }
        }
    }
}
