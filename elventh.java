package simple;

public class elventh {
    public static void main(String[] args) {
        elenptrn(5);
    }
    public static void  elenptrn(int n){
        for (int i = 0; i < n; i++) {
            int start;
            if (i % 2 == 0) {
                start = 1;
            }
            else {
                start = 0;
            }
            for (int j = 0; j <= i  ; j++) {
                System.out.print(start + " ");
                start = 1 - start;  // flip the number  
            }
            System.out.println();
        }
    }
}
