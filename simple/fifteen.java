package simple;

public class fifteen {
    public static void main(String[] args) {
        fiften(6);
        
    }
    public static void fiften(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch < 'A'+ (n - i - 1); ch++) {
                // this is the reverse of the alphabet printing
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
