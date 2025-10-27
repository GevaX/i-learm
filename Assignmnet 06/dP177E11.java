import unit4.collectionsLib.Queue;

class Courier {
    private int id;
    private double engineVolume;

    public Courier(int id, double engineVolume) {
        this.id = id;
        this.engineVolume = engineVolume;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}

public class dP177E11 {
    public static int sendDeliver(Queue<Courier> cQueue, double engineVolume) {
        Queue<Courier> temp = new Queue<>();
        Courier selected = null;

        while (!cQueue.isEmpty()) {
            Courier c = cQueue.remove();
            if (selected == null && c.getEngineVolume() >= engineVolume) {
                selected = c;
            }
            else {
                temp.insert(c);
            }
        }
        while (!temp.isEmpty()) {
            cQueue.insert(temp.remove());
        }
        return selected != null ? selected.getId() : -1;
    }
}
