package Recursion.basee;
// print from n to 1 using backtracking method 
public class reverbacktrack {
    public static void main(String[] args) {
        reback(1, 10);
    }
    public static void reback(int i , int n ) {
        if (i>10) {
            return;
        }
        reback(i+1, n);
        System.out.println(i);
    }
}
