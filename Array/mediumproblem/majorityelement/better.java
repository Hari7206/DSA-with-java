package Array.mediumproblem.majorityelement;

import java.util.HashMap;
import java.util.Map;

public class better {
    public static void main(String[] args) {
          HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {2 , 2 , 3 , 3 , 1 , 2 , 2};
        int n = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                System.out.println(entry.getKey() + " is the majority ");
            }
         }
    }
}
