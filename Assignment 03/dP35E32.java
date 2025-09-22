public class dP35E32 {
    public static boolean isEnglishOnly(String str) {
        if (str.isEmpty())
            return true;
        char c = str.charAt(0);
        boolean isLetter = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        if (!isLetter)
            return false;

        return isEnglishOnly(str.substring(1));
    }
}
