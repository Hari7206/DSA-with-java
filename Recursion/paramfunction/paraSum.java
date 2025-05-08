package Recursion.paramfunction;
// sum of first n number using the paramitrised way 
public class paraSum {
    public static void main(String[] args) {
        sum(1, 0,  5);
    }
    public static void sum(int i , int sum , int n ) {
        if (i>n) {
            System.out.println(sum);
            return;
        }
        sum(i+1 , sum + i , n);
    }
}
