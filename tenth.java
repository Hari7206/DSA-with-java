package simple;

public class tenth {
    public static void main(String[] args) {
        tenptr(5);
    }
    public static void tenptr(int n) {
        // row print
        for (int i = 0; i < 2*n - 1; i++) {
            // star here 
            int star = i;
            if(i > n)  {
                star = 2 * n -i; 
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
