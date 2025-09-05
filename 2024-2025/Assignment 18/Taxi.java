public class Taxi {
    private String taxiId;
    private int taxiNum;
    private String driverName;
    private int numPass;
    private boolean available = true;

    public Taxi(String taxiId, String driverName) {
        this.taxiId = taxiId;
        this.driverName = driverName;
        this.numPass = 4;
    }

    public Taxi(String taxiId, String driverName, int numPass) {
        this.taxiId = taxiId;
        this.driverName = driverName;
        this.numPass = numPass;
    }

    public String getId() {
        return taxiId;
    }

    public int getNum() {
        return taxiNum;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getNumPass() {
        return numPass;
    }

    public boolean isAvailable() {
        return available;
    }

    public void taxiBussy() {
        available = false;
    }
}
