package simple;

public class eight {
    public static void main(String[] args) {
        eighth(5);
    }
    public static void eighth(int n) {
     for (int i = 0; i < n; i++) {
            // space 
            for (int j = 0; j < i  ; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 0; k < 2 * n-(2 * i + 1 ); k++) {
                System.out.print("*");
            }
            System.out.println();
    }
    }
}
