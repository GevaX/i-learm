public class Game {
    private String gameName;
    private int numPlayers;
    private boolean isWater;

    public Game(String gameName, int numPlayers, boolean isWater) {
        this.gameName = gameName;
        this.numPlayers = numPlayers;
        this.isWater = isWater;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void setWater(boolean isWater) {
        this.isWater = isWater;
    }

    public String getGameName() {
        return gameName;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public boolean isWater() {
        return isWater;
    }
}
