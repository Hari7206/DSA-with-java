package BasicMath.digit;
// here we will solve the question of given the number n find out and return number of digit present in a number 

public class countDigit {
    public static void main(String[] args) {
        int n = 7789;
        int lastDigit;
        int count = 0;
        while (n > 0) {
            lastDigit = n % 10;
           System.out.println(" the last digit is " + lastDigit);
           count += 1;
           
           n = n / 10;
           System.out.println(" new n number " + n);
        }
        System.out.println("the total digit use in this is "+count);
}
}