import java.util.Arrays;

public class Program5 {
    // Original soulution, time complexity O(n^3)
    // public static Flashlight[] threeFlashlights(Flashlight[] arr, double total) {
    //     Flashlight[] res = new Flashlight[3];

    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             for (int k = j + 1; k < arr.length; k++) {
    //                 double sum = arr[i].getPrice() + arr[j].getPrice() + arr[k].getPrice();
    //                 if (sum == total) {
    //                     res[0] = arr[i];
    //                     res[1] = arr[j];
    //                     res[2] = arr[k];
    //                     return res;
    //                 }
    //             }
    //         }
    //     }

    //     return null;
    // }

    // Final Soulution, time complexity O(n^2)
    public static Flashlight[] threeFlashlights(Flashlight[] arr, double total) {
        Arrays.sort(arr);

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                double sum = arr[i].getPrice() + arr[j].getPrice() + arr[k].getPrice();

                if (sum == total) {
                    return new Flashlight[] { arr[i], arr[j], arr[k] };
                }
                else if (sum < total) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return null;
    }
}
