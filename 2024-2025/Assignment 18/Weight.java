public class Weight {
    private int kilo;
    private int gram;

    public Weight() {
        this.kilo = 0;
        this.gram = 0;
    }

    public Weight(int kilo, int gram) {
        this.kilo = kilo;
        this.gram = gram;
    }

    public Weight(int totalGrams) {
        this.kilo = totalGrams / 1000;
        this.gram = totalGrams % 1000;
    }

    public void add(Weight other) {
        this.kilo += other.kilo;
        this.gram += other.gram;
    }

    public boolean less(Weight other) {
        int weightA = this.kilo * 1000 + this.gram;
        int weightB = other.kilo * 1000 + other.gram;

        return weightB > weightA;
    }

    public int getWeight() {
        return kilo * 1000 + gram;
    }
}
