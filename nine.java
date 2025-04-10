package simple;
public class nine {
    public static void main(String[] args) {
        sevent(5);
        print(5);
    }
    public static void print(int n) {
        // row
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {    
                System.out.print(" ");
            }
            for (int k = 0; k < 2*n-(2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // this is how from adding two we can make a new 
    }
    public static void sevent(int n) {
        // row
            for (int i = 0; i < n; i++) {  
                // space  
                for (int j = 0; j < n -i -1 ; j++) {
                    System.out.print(" ");
                }
                // star
                for (int k = 0; k < 2*i+1 ; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
      }
}
