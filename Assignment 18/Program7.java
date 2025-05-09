public class Program7 {
    public static void moreThen(Actor[] actors, int num) {
        int c = 0;
        for (int i = 0; i < actors.length; i++) {
            if (actors[i].getNumFilms() > num) {
                c++;
            }
        }

        System.out.println("Number of actors: " + c);
    }
    public static void main(String[] args) {
        Actor[] actArr = new Actor[37];
    }
}
