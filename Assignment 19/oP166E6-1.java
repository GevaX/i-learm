interface IClean {
    void clean();
}

interface ICheckIn {
    void checkIn();
}

class Room implements IClean {
    public static int basePrice = 100;
    protected int numOfBeds;
    protected int capacity;

    public Room(int numOfBeds, int capacity) {
        this.numOfBeds = numOfBeds;
        this.capacity = capacity;
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the room...");
    }
}

class Suite extends Room {
    protected int extraCrg;
    protected boolean addBed;

    public Suite(int numOfBeds, int capacity, int extraCrg, boolean addBed) {
        super(numOfBeds, capacity);
        this.extraCrg = extraCrg;
        this.addBed = addBed;
    }
}

class Family extends Room implements ICheckIn {
    protected boolean babycot;

    public Family(int numOfBeds, int capacity, boolean babycot) {
        super(numOfBeds, capacity);
        this.babycot = babycot;
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in to the family room...");
    }
}
