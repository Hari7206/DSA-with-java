package simple;
public class simple {
    public static void main(String[] args) {
       int n = 6;
       runfunc(n);
    }
    public static void runfunc(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
