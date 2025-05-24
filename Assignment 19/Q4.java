class ElectricBycicle {
    private int code;
    private double km;

    public ElectricBycicle(int code) {
        this.code = code;
        this.km = 0;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getCode() {
        return code;
    }

    public double getKm() {
        return km;
    }
}

class TelOfan {
    private String streetName;
    private int current;
    private ElectricBycicle[] bikes;

    public TelOfan(String strretName, int max) {
        this.streetName = strretName;
        this.current = 0;
        this.bikes = new ElectricBycicle[max];
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setBikes(ElectricBycicle[] bikes) {
        this.bikes = bikes;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getCurrent() {
        return current;
    }

    public ElectricBycicle[] getBikes() {
        return bikes;
    }

    public ElectricBycicle lowestKMBike() {
        double min = Double.MAX_VALUE;
        int bikeI = -1;

        for (int i = 0; i < current; i++) {
            if (bikes[i].getKm() < min) {
                min = bikes[i].getKm();
                bikeI = i;
            }
        }

        if (bikeI == -1) {
            return null;
        }
        ElectricBycicle bike = bikes[bikeI];
        bikes[bikeI] = null;

        for (int i = bikeI; i < current - 1; i++) {
            bikes[i] = bikes[i + 1];
        }
        bikes[current - 1] = null;
        current--;

        return bike;
    }

    public void moveToNewStation(TelOfan other) {
        if (current < bikes.length) {
            ElectricBycicle bike = other.lowestKMBike();
            if (bike != null) { 
                bikes[current] = bike;
                current++;
            } else {
                System.out.println("Other station has no bikes to move.");
            }
        } else {
            System.out.println("No space available");
        }
    }
}