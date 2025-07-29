package Array.mediumproblem.leader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class optimal {
    public static void main(String[] args) {
         int arr[] = {10 , 22 , 12 , 3 , 0  , 6};
        List<Integer> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
      Collections.reverse(ans);
        System.out.println(ans);
    }
}
