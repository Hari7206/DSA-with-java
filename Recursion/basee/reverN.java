package Recursion.basee;
// here we have to print the n to 1 
public class reverN {
    public static void main(String[] args) {
        rever(10);
    }
    public static void rever(int i ) {
     if (i<1) {
        return;
     }
     System.out.println(i);
     rever(i-1);
}
}
