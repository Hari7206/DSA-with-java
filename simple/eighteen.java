package simple;
public class eighteen {
    public static void main(String[] args) {
        eighte(5);
    }
    public static void  eighte( int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for (int j = 0; j < 2*i + 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                }
                else {
                    ch--;
                }
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
