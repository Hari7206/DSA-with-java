package simple;
public class ninteen {
    public static void main(String[] args) {
        nineete(5);
    }
    public static void nineete(int n) {
        for (int i = 0; i < n; i++) {
            char ch =  (char) ('E'-i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
