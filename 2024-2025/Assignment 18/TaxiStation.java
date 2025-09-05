public class TaxiStation {
    private String name;
    private Taxi[] taxis = new Taxi[80];
    private int current = 0;

    public TaxiStation(String name) {
        this.name = name;
    }

    public void addTaxi(String driverName, String taxiId, int numPass) {
        taxis[current] = new Taxi(taxiId, driverName, numPass);
    }

    public int numberOfTaxis() {
        return current;
    }

    public String findTaxi(int numPass) {
        for (int i = 0; i < current; i++) {
            if (taxis[i].getNumPass() >= numPass && taxis[i].isAvailable()) {
                return taxis[i].getId();
            }
        }

        return null;
    }
}
