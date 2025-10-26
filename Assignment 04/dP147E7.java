import java.util.Scanner;

import unit4.collectionsLib.Stack;

public class dP147E7 {
    public static Scanner reader = new Scanner(System.in);

    public static String route(Stack<String> urls, String option) {
        if (option.equals("Back")) {
            if (urls.isEmpty()) return "";
            return urls.pop();
        }
        else if (option.equals("BackX")) {
            String url = "";
            int x = reader.nextInt();

            if (x < 2 || x > 9) return "";
            for (int i = 0; i < x; i++) {
                if (urls.isEmpty()) return "";
                url = urls.pop();
            }
            return url;
        }
        else {
            return "";
        }
    }
}
