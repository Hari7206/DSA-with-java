package BasicMath.digit;

public class armstrong {
     //  here we will solve this problem of armtrong number 
     public static void main(String[] args) {
        int n = 371;
        int lastDigit;
       int  sum = 0;
       int dub = n;
        while (n > 0) {
            lastDigit = n % 10;
           System.out.println(" the last digit is " + lastDigit);
           sum = sum + (lastDigit * lastDigit * lastDigit );  
           n = n / 10;
           System.out.println(" new n number " + n);
        }
        if(dub == sum ) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
