package simple;
// here we print the pattren in the pyramid form
public class seventh {
    public static void main(String[] args) {
        sevenptrn(5);
    }
    public static void sevenptrn(int n)  {
        for (int i = 0; i < n; i++) {
                    //space 
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
                //star
            }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                // next line
                System.out.println();
            }
    }
}
// 5 - i - 5 = 0   ,    1 -5 -5 = 1 ,   2 -

