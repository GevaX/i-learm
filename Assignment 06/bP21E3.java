import java.util.Scanner;

public class bP21E3 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        String str;

        System.out.println("Enter string: ");
        str = reader.next();
        
        boolean hasDigits = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                hasDigits = true;
            }
        }
        if (hasDigits) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
