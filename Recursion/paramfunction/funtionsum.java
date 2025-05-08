package Recursion.paramfunction;
// print the sum of n number using the function retrun typpe
public class funtionsum {
    public static void main(String[] args) {
      int sum =  funcSum(5);
      System.out.println(sum);
    }
    public static int funcSum(int n) {
        if (n==0) {
            return 0;
        }
        else return n + funcSum( n - 1);
    }
}
