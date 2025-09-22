public class dP35E31 {
    public static int numOfLetters(String str) {
        char c = str.charAt(str.length() - 1);
        if (str.length() == 1) {
            return c >= 'a' && c <= 'z' ? 1 : 0;
        }

        return (c >= 'a' && c <= 'z' ? 1 : 0) + numOfLetters(str.substring(0, str.length() - 1));
    }
}
