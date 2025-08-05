package Array.mediumproblem.subarray;
// here i did the optimal version of the subarray how many subarray of no k 
import java.util.HashMap;

public class optimal {
    public static void main(String[] args) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
         int arr[] = {1 , 2 , 3 , -3 , 1  , 1 , 1  , 4 , 2 , -3};
         int sum = 0;
         int cout = 0;
         int k = 3;

         prefixSumMap.put(0, 1);

         for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
            if (prefixSumMap.containsKey(sum - k)) {
                cout += prefixSumMap.get(sum-k);
            }
             prefixSumMap.put(sum , prefixSumMap.getOrDefault(sum, 0) + 1);
         }
         System.out.println(cout);
    }
}
