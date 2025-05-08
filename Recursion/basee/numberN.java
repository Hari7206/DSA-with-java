package Recursion.basee;
// so here we will print the number to the n times 

public class numberN {
    public static void main(String[] args) {
        Num(1, 10);
    }
    public static void Num(int i , int n ) {
        if (i>n) {
            return;
        }
        System.out.println(i);
        Num(1+i, n);
    }
}
