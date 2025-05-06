package BasicMath.digit;
// Write a program to generate the reverse of a given
// number N. Print the corresponding reverse number.
// Note : If A Number Has Trailing Zeros, Then Its
// Reverse Will Not Include Them. For E.G., Rexe Of
// 10400 Will Be 401 Instead Of 00401.
public class reverseNum {
    public static void main(String[] args) {
        int n = 7789;
        System.out.println(" this is the number before the  digit  before the reverse " + n);
        int lastDigit;
        int count = 0;
       int  reverseNum = 0;
        while (n > 0) {
            lastDigit = n % 10;
           System.out.println(" the last digit is " + lastDigit);
           count += 1;
           
           n = n / 10;
           System.out.println(" new n number " + n);
           reverseNum = (reverseNum * 10) + lastDigit;
        }
        System.out.println("the total digit use in this is "+count);
        System.out.println("the reverse digit use in this is "+reverseNum);
}
}
