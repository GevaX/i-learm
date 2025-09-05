public class Airport {
    private Flight[] flights;

    public Airport(Flight[] flights) {
        this.flights = flights;
    }

    public boolean isFly() {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i].getName().equals("Sky")) {
                return true;
            }
        }
        
        return false;
    }
}
