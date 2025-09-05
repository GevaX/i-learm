public class CarInfo {
    private int id;
    private boolean privateCar;
    private int speed;

    public CarInfo(int id, boolean privateCar, int speed) {
        this.id = id;
        this.privateCar = privateCar;
        this.speed = speed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrivateCar(boolean privateCar) {
        this.privateCar = privateCar;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public boolean getPrivateCar() {
        return privateCar;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isIllegal(int maxSpeed) {
        return privateCar || speed > maxSpeed;
    }
}
