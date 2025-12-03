import unit4.collectionsLib.Node;

public class dP107E18 {
    public static int countFirstName(Node<String> names, String firstName) {
        Node<String> p = names;
        int c = 0;

        while (p != null) {
            String first = p.getValue().split(" ")[0];
            if (first.equals(firstName)) {
                c++;
            }
            p = p.getNext();
        }
        return c;
    }
}
