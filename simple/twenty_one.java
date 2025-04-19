package simple;

public class twenty_one {
    public static void main(String[] args) {
        tewOne(5);

    }

    public static void tewOne(int n) {
        int inSt = 2*n-2;
        for (int i = 1; i <= 2*n-1; i++) {
            int star = i;

            if (i>n) {
                    star = 2*n - i;
            }
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= inSt; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            if (i < n ) {
                inSt -= 2;
            }
            else {
                inSt += 2;
            }
            System.out.println();
        }
    }
}
