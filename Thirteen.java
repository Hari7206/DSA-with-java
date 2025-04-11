package simple;

public class Thirteen {
    public static void main(String[] args) {
        numptrn(5);
    }
    public static void numptrn(int n){
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;        
            }
            System.out.println();
        }
    }
}