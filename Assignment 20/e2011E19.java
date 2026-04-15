// section a is in e2011E19a.png
// c) Since the formula for a sum differs depending on the type of sequence the function must be implemented in each class.
class Sequence {
    protected int first;

    public Sequence(int first) {
        this.first = first;
    }

    public int theNElement(int n) {
        return this.first;
    }

    public void displayNElements(int n) {
        System.out.print("The sequence elements: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(this.theNElement(i + 1) + " , ");
        }
        System.out.println(this.theNElement(n));
    }

    public int sumNElements(int n) {
        return this.first * n;
    }
}

class ASeq extends Sequence {
    private int difference;

    public ASeq(int first, int difference) {
        super(first);
        this.difference = difference;
    }

    @Override
    public int theNElement(int n) {
        return this.first + (n - 1) * this.difference;
    }

    // displayNElements is inherited

    @Override
    public int sumNElements(int n) {
        return n * (this.first + this.theNElement(n)) / 2;
    }
}

class GSeq extends Sequence {
    private int product;

    public GSeq(int first, int product) {
        super(first);
        this.product = product;
    }

    @Override
    public int theNElement(int n) {
        return this.first * (int) Math.pow(this.product, n - 1);
    }

    // displayNElements is inherited

    @Override
    public int sumNElements(int n) {
        return this.first * ((int) Math.pow(this.product, n) - 1) / (this.product - 1);
    }
}

public class e2011E19 {
    public static char check(ASeq aSeq, GSeq gSeq, int n) {
        int sumA = aSeq.sumNElements(n);
        int sumG = gSeq.sumNElements(n);

        if (sumA > sumG) {
            return 'A';
        } else if (sumG > sumA) {
            return 'G';
        } else {
            return 'E';
        }
    }
}
