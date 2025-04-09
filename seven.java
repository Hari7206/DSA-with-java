package simple;

public class seven {
    public static void main(String[] args) {
        sevent(5);
        
    }
    public static  void sevent(int n ) {
        for (int i = 0; i < n; i++) {

            //  for space 
            for (int j = 0; j < n-i-1; j++) {
                System.out.print( " ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
