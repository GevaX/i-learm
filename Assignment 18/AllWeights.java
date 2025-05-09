public class AllWeights {
    private Weight[] arr;

    public AllWeights(Weight[] arr) {
        this.arr = arr;
    }

    public Weight sum() {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getWeight();    
        }
        return new Weight(sum);
    }
}
