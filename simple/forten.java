package simple;

public class forten {
    public static void main(String[] args) {
        // making the alphabet pattern
        forteen(5);
    }
    public static void forteen(int n ){
        for (int i = 0; i <= n; i++) {
            for(char ch='A'; ch < 'A'+ i; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    }
}
