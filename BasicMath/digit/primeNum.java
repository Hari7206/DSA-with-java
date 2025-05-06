package BasicMath.digit;
public class primeNum {
    // here we will see that how to find the prime no in the programing
    public static void main(String[] args) {
        primeNUM(7);
    }
    public static void primeNUM(int n) {
        int times = 0;
        for (int i = 1; i <=n; i++) {
            if (n % i == 0) {
                times++;
            }
        }
        if (times == 2) {
            System.out.println("It is the prime implecant");
        }
        else {
            System.out.println("it is not an prime implecant");
        }
    }
}
// this is how we can find that no is prime implecant or not 