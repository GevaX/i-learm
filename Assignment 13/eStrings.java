public class eStrings {
    // 5
    public static String reverse(String s) {
        String res = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }

    // 6a
    public static char capitalize(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 32);
        }
        return c;
    }

    // 6b
    public static String capitalizeString(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            res += capitalize(s.charAt(i));
        }
        return res;
    }

    // 8
    public static int indexOf(String s, char c) {
        return indexOf(s, c);
    }

    // 9
    public static boolean isStartSame(String s1, String s2) {
        if (s2.length() > s1.length()) return false;

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != s1.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // 11
    public static String substring(String s, int k) {
        if (k < 0 || k >= s.length()) return "";

        String res = "";
        for (int i = 0; i <= k; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    // 12
    public static String substringEnd(String s, int k) {
        if (k < 0 || k >= s.length()) return "";

        String res = "";
        for (int i = k; i < s.length(); i++) {
            res += s.charAt(i);
        }
        return res;
    }

    // 13
    public static boolean contains(String s1, String s2) {
        return s1.contains(s2);
    }
}
