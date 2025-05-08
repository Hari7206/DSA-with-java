package Recursion.paramfunction;
// print the factorial of n number using the function  way 
public class factori {
    public static void main(String[] args) {
        int multi = fact(5);
        System.out.println(multi);
    }
    public static int fact(int n ) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }
}
