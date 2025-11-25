import unit4.collectionsLib.Queue;

public class dP176E9 {
    // b
    public static void mergeQueues(Queue<String> activeQ, Queue<String> closedQ) {
        String first = activeQ.head();

        while (!closedQ.isEmpty()) {
            activeQ.insert(activeQ.remove());
            activeQ.insert(closedQ.remove());
        }

        while (activeQ.head() != first) {
            activeQ.insert(activeQ.remove());
        }
    }

    // a
    public static void main(String[] args) {
        Queue<String> q1 = new Queue<>();
        Queue<String> q2 = new Queue<>();

        q1.insert("Alice");
        q1.insert("Bob");
        q1.insert("Charlie");
        q1.insert("Diana");
        q1.insert("Edward");
        q1.insert("Fiona");
        q1.insert("George");

        q2.insert("Hannah");
        q2.insert("Ian");
        q2.insert("Jack");
        q2.insert("Karen");
        q2.insert("Liam");

        mergeQueues(q1, q2);

        System.out.println(q1);
        System.out.println(q2);
    }
}
