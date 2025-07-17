package Array.mediumproblem.Twosum;

import java.util.HashMap;
import java.util.Map;

// so here we will see the hashing technique for the two sum 
public class twoosum {
    public static void main(String[] args) {
          Map<Integer, Integer> map = new HashMap<>();
          int arr[] = {2 , 6 , 5 , 8 , 11};
          int target = 14;
          boolean found = false;
         for (int i = 0; i < arr.length; i++) {
            int remainng = target - arr[i];
            if (map.containsKey(remainng)) {
                found = true;
              System.out.println(map.get(remainng) + " " + i);
                break;
            }         
            else {
                found = false;
            }
            map.put(arr[i], i);
         }
         System.out.println(found);
        
    }
}
