class Bicycle {
    private String color;
    private int maxSpeed;
    private double kilometrage;

    public Bicycle(String color, int maxSpeed, double kilometrage) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.kilometrage = kilometrage;
    }

    public void ride(double distance) { }
}

class BMX extends Bicycle {
    private boolean competitionSuitable;
    private double maxJumpHeight;

    public BMX(String color, int maxSpeed, double kilometrage, boolean competitionSuitable, double maxJumpHeight) {
        super(color, maxSpeed, kilometrage);
        this.competitionSuitable = competitionSuitable;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void jump(double height) { }
}

class MountainBike extends Bicycle {
    private int maxHeight;
    private boolean isInHighGear;

    public MountainBike(String color, int maxSpeed, double kilometrage, int maxHeight, boolean isInHighGear) {
        super(color, maxSpeed, kilometrage);
        this.maxHeight = maxHeight;
        this.isInHighGear = isInHighGear;
    }

    public void setHighGear() { }
}

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class RaceBike extends Bicycle {
    private Date lastCare;

    public RaceBike(String color, int maxSpeed, double kilometrage, Date lastCare) {
        super(color, maxSpeed, kilometrage);
        this.lastCare = lastCare;
    }

    public void race(double distance, double speed) { }
}

class SnowMountainBike extends MountainBike {
    public SnowMountainBike(String color, int maxSpeed, double kilometrage, int maxHeight, boolean isInHighGear) {
        super(color, maxSpeed, kilometrage, maxHeight, isInHighGear);
    }
}