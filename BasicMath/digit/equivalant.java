package BasicMath.digit;
// so here we will do the better way of gcd to find
public class equivalant {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 15;
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            }
            else if (n2 > n1) {
                n2 = n2 % n1;
            }
            if( n1 == 0 ) {
                System.out.println(n2);
            }
            else {
                System.out.println(n1);
            }
        }
    }
}
