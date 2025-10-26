import unit4.collectionsLib.Queue;

public class dP176E6 {
    public static boolean ballGame(Queue<String> cylinder, int guess) {
        String e = "";

        for (int i = 0; i < guess; i++) {
            e = cylinder.remove();
            cylinder.insert(e);
        }
        if (e == "gold") return true;
        return false;
    }
}
