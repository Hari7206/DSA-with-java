package BasicMath.digit;

public class gcdNum {
    public static void main(String[] args) {
        gcds(12, 9);
        othergcds(30,40);
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
    // here we will see the other method of doing the gcd 
    public static void othergcds(int n1 , int  n2 ) {
        for (int i = Math.min(n1 , n2); i >=1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("the gcd is of "+ n1 +" and "+ n2 + " is = "+i); // the i is the gcd heres
                break;
                
            }
        }
    }

}
// this is how we can find the gcd in the java 