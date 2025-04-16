package simple;
// here we write the code of the second patterns 
public class second {
    public static void main(String[] args) {
        runfun(5);
    }
    public static void runfun (int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
