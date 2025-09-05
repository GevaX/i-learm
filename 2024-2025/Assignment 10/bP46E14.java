public class bP46E14 {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        int mid = a.length / 2;
        boolean halvesEqual = true;
        for (int i = 0; i < mid && halvesEqual; i++) {
            if (a[i] != a[mid + i]) {
                halvesEqual = false;
            }
        }
        if (halvesEqual) {
            System.out.println("Half");
        }
    }
}
