public class Country {
    private String countryName;
    private Game[] games;

    public Country(String countryName) {
        this.countryName = countryName;
        this.games = new Game[43];
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }

    public String getCountryName() {
        return countryName;
    }

    public Game[] getGames() {
        return games;
    }

    public boolean isInGame(String gameName) {
        for (int i = 0; i < games.length; i++) {
            if (games[i].getGameName().equals(gameName)) {
                return true;
            }
        }
        
        return false;
    }
}
