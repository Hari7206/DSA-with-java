package arraypractice.easy;

import java.util.*;

// so here we will use the brute force version for this 
public class removdub {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
    int arr[] = { 1 , 2 , 3 , 3  , 4  , 4  , 4 , 5};
    for (int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
    }
  for (int elem : set) {
      System.out.println(elem);
  }
    }

}
