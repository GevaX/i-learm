public class Q3 {
    public int fiboN(int n) {
        if (n <= 2) return n - 1;
        
        int a = 0, b = 1, res = 0;
        for (int i = 3; i <= n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }

    public void goldenRatio(double fi, double epsilon, int maxEpochs) {
        for (int n = 2; n <= maxEpochs; n++) {
            double value = (double) fiboN(n - 1) / fiboN(n);
            double delta = Math.abs(fi - value);
            
            if (delta < epsilon) {
                System.out.println("N value for golden ratio is " + n + " for ratio " + value);
                return;
            }
        }
    }
}
