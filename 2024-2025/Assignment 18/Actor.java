public class Actor {
    private String id;
    private String gender;
    private int numFilms;

    public Actor(String id, String gender, int numFilms) {
        this.id = id;
        this.gender = gender;
        this.numFilms = numFilms;
    }

    public void addFilm() {
        numFilms++;
    }

    public int compare(Actor other) {
        return this.numFilms > other.numFilms ? 1 :
               this.numFilms < other.numFilms ? 2 : 3;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNumFilms(int numFilms) {
        this.numFilms = numFilms;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public int getNumFilms() {
        return numFilms;
    }
}
