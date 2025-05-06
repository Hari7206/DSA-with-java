package BasicMath.digit;
// so today we are going to see the basic concept of math how we can do the problem in the java of extracting the number 
public class extreactNum {
    public static void main(String[] args) {
     int n = 7789;
     int lastDigit;
     while (n > 0) {
        lastDigit = n % 10;
        System.out.println(" the last digit is " + lastDigit);
        n = n / 10;
        System.out.println(" new n number " + n);
     }
    }
}
