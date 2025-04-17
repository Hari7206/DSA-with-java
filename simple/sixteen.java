package simple;

public class sixteen {
    public static void main(String[] args) {
        sixteens(5);
    }
    public static void sixteens(int n) {
        for (int i = 0; i < n; i++) {
            char  ch = (char) ('A' +(i)) ;
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
