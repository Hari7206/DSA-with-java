package BasicMath.digit;
import  java.util.*;
public class mathdiv {
    public static void main(String[] args) {
       System.out.println(printdivisor(36)); 
    }
    public static ArrayList<Integer> printdivisor(int n ) {
        ArrayList<Integer> divisor = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisor.add(i);
                if ((n / i) != i) {
                    divisor.add(n / i);
                }
            }
        }
        return divisor;
    }
}
// this is how we can create the list of any number to make it ready for the shorted form 