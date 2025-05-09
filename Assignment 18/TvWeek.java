public class TvWeek {
    private TvProgram[] arrProg = new TvProgram[100];
    private int current = 0;

    public void addProgram(TvProgram prog) {
        arrProg[current] = prog;
        current++;
    }

    public int sportPrograms() {
        int c = 0;
        for (int i = 0; i < current; i++) {
            if (arrProg[i].getSport()) {
                c++;
            }
        }

        return c;
    }
}
