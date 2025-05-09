public class Flight {
    private String name;
    private String destination;
    private int flightCode;
    private Time flightTime;

    public Flight(String name, String destination, int flightCode, Time flightTime) {
        this.name = name;
        this.destination = destination;
        this.flightCode = flightCode;
        this.flightTime = flightTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightCode(int flightCode) {
        this.flightCode = flightCode;
    }

    public void setFlightTime(Time flightTime) {
        this.flightTime = flightTime;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightCode() {
        return flightCode;
    }

    public Time getFlightTime() {
        return flightTime;
    }
}
