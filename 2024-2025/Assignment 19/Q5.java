class Falafel {
    private int numBalls;
    private String bread;
    private boolean tahini;
    
    public Falafel(int numBalls, String bread, boolean tahini) {
        this.numBalls = numBalls;
        this.bread = bread;
        this.tahini = tahini;
    }

    public int price() {
        return -1; // PLACEHOLDER FOR PRICE LOGIC
    }

    public void setNumBalls(int numBalls) {
        this.numBalls = numBalls;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setTahini(boolean tahini) {
        this.tahini = tahini;
    }

    public int getNumBalls() {
        return numBalls;
    }

    public String getBread() {
        return bread;
    }

    public boolean isTahini() {
        return tahini;
    }
}

class Delivery {
    private Falafel[] manot;
    private int currNum;

    public Delivery() {
        this.manot = new Falafel[100];
        this.currNum = 0;
    }

    public boolean addMana(Falafel m) {
        if (currNum == manot.length) return false;
        manot[currNum] = m;
        currNum++;
        return true;
    }

    public int getCurrNum() {
        return currNum;
    }

    public Falafel[] getManot() {
        return manot;
    }
}

public class Q5 {
    public static double salary(Delivery[] deliveries) {
        double salary = 0;
        for (int i = 0; i < deliveries.length; i++) {
            Falafel[] manot = deliveries[i].getManot();
            for (int j = 0; j < deliveries[i].getCurrNum(); j++) {
                if (manot[j].isTahini() && manot[j].getNumBalls() > 5) {
                    salary += manot[j].price() / 10;
                }
                else {
                    salary += manot[j].price() / 20;
                }
            }
        }

        return salary;
    }
}