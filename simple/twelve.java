package simple;

public class twelve {
    public static void main(String[] args) {
        binptrn(5);
    }
    // here we make the binar pattren
    public static void binptrn(int n) {
        for (int i = 1; i <= n; i++) {
            // row 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space 
            for(int k = 1; k<= 2*(n-i); k++) {
                System.out.print(" ");
            }
            //number
            for (int l = i; l >=1 ; l--) {
                System.out.print(l);       
            }
            System.out.println();
    }
}
}