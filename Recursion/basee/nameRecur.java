package Recursion.basee;
// 1 que . print the name n time using the recursion
public class nameRecur {
    public static void main(String[] args) {
        name(1, 4);
    }
    public static void name(int i , int n ) {
        if (i > n) {
            return;
        }
        System.out.println("Hari");
        name(i+1, n);
    }
}
