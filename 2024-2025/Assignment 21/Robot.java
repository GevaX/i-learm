public class Robot {
    private String name;
    private int position;
    public boolean isInGame;

    public Robot(String name, int position) {
        this.name = name;
        this.position = position;
        this.isInGame = true;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isInGame() {
        return isInGame;
    }

    public String toString() {
        return "Robot{name='" + name + "', position=" + position + ", inGame=" + isInGame + "}";
    }

    public void forward() {
        this.position++;
    }

    public void back() {
        this.position--;
    }

    public void forward(int n) {
        this.position += n;
    }

    public void back(int n) {
        this.position -= n;
    }

    public void terminate() {
        this.isInGame = false;
    }
}
