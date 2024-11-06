import java.util.Scanner;

public class bP21E6 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        boolean isValid = false, hasLetter = false, hasDigit = false;

        while (!isValid) {
            System.out.println("Enter password: ");
            str = reader.next();
            if (str.length() >= 6) {
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (Character.isLetter(ch)) {
                        hasLetter = true;
                    }
                    if (Character.isDigit(ch)) {
                        hasDigit = true;
                    }
                    if (hasLetter && hasDigit) {
                        isValid = true;
                    }
                }
            }
            if (!isValid) {
                System.out.println("Invalid password");
            }
        }
    }
}
