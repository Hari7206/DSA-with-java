package BasicMath.digit;

public class divisorr {
    public static void main(String[] args) {
        printdivisor(36);
        printdivisor(46);
        printdivisor(56);
    }
    public static void printdivisor(int n ) {
        System.out.println(" the divisor of " + n + " :" );
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
