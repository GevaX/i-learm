import unit4.collectionsLib.Queue;

class Job {
    private int id;
    private int time;

    public Job(int id, int time) {
        this.id = id;
        this.time = time;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
}

public class dP176E8 {
    public static void performJobs(Queue<Job> jobs, int time) {
        int cTime = 0;

        while (!jobs.isEmpty() && cTime < time) {
            Job j = jobs.head();
            if (j.getTime() + cTime <= time) {
                jobs.remove();
                cTime += j.getTime();
                System.out.println("Preformed job " + j.getId());
            }
            else {
                return;
            }
        }
    }
}
