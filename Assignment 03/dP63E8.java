public class dP63E8 {
    // With counting array
    // Time complexity: O(n)
    public static void distribution(int[] arr) {
        int[] count = new int[101];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        System.out.println("Grades distribution:");
        for (int i = 0; i < count.length; i++) {
            System.out.printf("Grade %d: %d students", i, count[i]);
        }
    }
    
    // Without counting array
    // Time complexity: O(n)
    public static void distributionB(int[] arr) {
        int c = 0;

        System.out.println("Grades distribution:");
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) c++;
            }
            System.out.printf("Grade %d: %d students", i, c);
        }
    }
}
