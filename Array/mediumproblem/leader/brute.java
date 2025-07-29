package Array.mediumproblem.leader;

import java.util.ArrayList;
import java.util.List;

public class brute {
    public static void main(String[] args) {
        int arr[] = {10 , 22 , 12 , 3 , 0  , 6};
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }

                
            }
            if ( leader == true) {
                    ans.add(arr[i]);
                }
                
        }

            System.out.println(ans);
    }
}
