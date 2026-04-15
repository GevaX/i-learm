class AA {
    private String st;

    public AA() {
        this.st = "excellent";
    }

    public AA(String st) {
        this.st = st;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public boolean isLike(Object obj) {
        return obj instanceof AA && ((AA) obj).st.equals(this.st);
    }

    @Override
    public String toString() {
        return "st=" + st;
    }
}

class BB extends AA {
    private int num;

    public BB() {
        super();
        this.num = 1;
    }

    public BB(int num, String st) {
        super(st);
        this.num = Math.abs(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean isLike(Object obj) {
        return obj instanceof BB && ((BB) obj).num == this.num;
    }

    @Override
    public String toString() {
        return super.toString() + ", num=" + num;
    }
}

class e2011E17 {
    public String longString(Object arr[]) {
        String res = "";

        for (Object obj : arr) {
            if (obj instanceof BB) {
                BB b = (BB) obj;
                for (int i = 0; i < b.getNum(); i++) {
                    res += b.getSt();
                }
            } else if (obj instanceof AA) {
                AA a = (AA) obj;
                res += a.getSt();
            }
        }
        return res;
    }
}

// c. yes, the output will be "st=excellent, num=1". The isLike version of BB is
// run.
// d. no, you cannot downcast a parent object to a child object because aa is
// not of type BB. The error occurs at compile time because there is no explicit
// cast and it will be "Type mismatch: cannot convert from AA to BB".