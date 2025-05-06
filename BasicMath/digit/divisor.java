package BasicMath.digit;
// so here we solve the question how we can find the divisor of any number;
public class divisor {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
