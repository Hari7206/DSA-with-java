package Recursion.basee;
// print the number linearly using the backtracking method from 1 to n
public class backtrack {
    public static void main(String[] args) {
        backtra(10, 10);
    }
    public static void backtra(int i , int n ) {
        if (i<1) {
            return;
        }
        backtra(i-1, n);   /// so here when it run the everytime it check that weather it met to the condtion or not till it is 0, 10 it will not return and after that it will start to retrun the value so the last come print as the first and the first print as the last .
        System.out.println(i);
    }
}
