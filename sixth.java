// so here we will do the sixth pattern
package simple;
public class sixth {
    public static void main(String[] args) {
        sixthptrn(5);
        
    }
    public static void sixthptrn(int n) {
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n-i; j++) {
            System.out.print(j);
    }
    System.out.println();
  }
    }
    }

