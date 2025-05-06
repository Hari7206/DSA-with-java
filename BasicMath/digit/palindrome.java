package BasicMath.digit;
// Write a program to determine if given number is palindrome or not- Print true if it is
// palindrome. false otherwise.
// Palirx)rne Are The Numbers For Which Reverse Is Exactly Same As The Original
// One. For Eg. 121
public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(" this is the number before the  digit  before the reverse " + n);
        int lastDigit;
        int count = 0;
       int  reverseNum = 0;
       int dubli = n;
        while (n > 0) {
            lastDigit = n % 10;
           System.out.println(" the last digit is " + lastDigit);
           count += 1;
           
           System.out.println(" new n number " + n);
           reverseNum = (reverseNum * 10) + lastDigit;
           n = n / 10;
        }
        System.out.println("the total digit use in this is "+count);
        System.out.println("the reverse digit use in this is "+reverseNum);
        if (dubli == reverseNum) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
}
}
