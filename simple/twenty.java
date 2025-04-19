package simple;

public class twenty {
    public static void main(String[] args) {
        twete(5);
    }
    public static void  twete(int n){
        int inSl = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < inSl; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            inSl += 2; 
            System.out.println();
        }
        int inSle = 2*n - 2 ;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < inSle; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            inSle -= 2; 
            System.out.println();
    }
}
}