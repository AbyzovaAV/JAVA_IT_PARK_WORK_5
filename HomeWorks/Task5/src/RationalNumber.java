public class RationalNumber {
    int a, b;

    public RationalNumber() {
        a = 0;
        b = 1;
    }

    public RationalNumber(int x, int y) {
        a = x;
        b = y;
    }

    public double toDouble(String[] args) {
        double xc = a / b;
        System.out.println(xc);
        return 0;
    }

    public double show(double xc) {
        return (xc);
    }

    public int nod(int x, int y) {
        x = a;
        y = b;
        if (a != 0 && b != 0) {
            while (a != 0 & b != 0) {
                if (a > b) a = a % b;
                else b = b % a;
            }
            int c = b + a;
            return b + a;
        } else return 0;
    }

    public void optimize() {

    }
}