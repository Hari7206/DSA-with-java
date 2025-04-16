package simple;
public class fourth {
    public static void main(String[] args) {
        runfourth(6);
    }
    public static void runfourth(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
