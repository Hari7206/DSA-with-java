package BasicMath.digit;

public class gcdNum {
    public static void main(String[] args) {
        gcds(12, 9);
    }
    public static void gcds(int n1 , int  n2 ) {
        int great = 1;   // it is as the gcd no of our code 
        for (int i = 1; i <=Math.min(n1 , n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                great = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + great);
    }
}
// this is how we can find the gcd in the java 