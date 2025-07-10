// so here we will do the solution of the union of the 2 array brute force approch 
package Array.arrayproblem;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class union {
public static void main(String[] args) {
 Set<Integer> temp = new TreeSet<>();

      int arrOne[] = { 1  , 1 ,  3 ,  5,  6  ,  9};
      int arrTwo[] = { 1  , 2 ,  3 ,  4,  6  , 7, 8};

      for (int i = 0; i < arrOne.length; i++) {
        temp.add(arrOne[i]);
      }

      for (int i = 0; i < arrTwo.length; i++) {
        temp.add(arrTwo[i]);
      }

      Set<Integer> union = new HashSet<>();
    union.addAll(temp);
      System.out.println(temp);

      
      

}
}
