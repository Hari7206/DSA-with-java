// package Array.arrayproblem;
// // so here we will do the longest sum of subarray another brute force approch 

// import java.util.HashMap;

// public class longssub {

//     public static void main(String[] args) {
//         int arr[] = { 1 , 2 , 3 , 1 , 1 , 1 , 1 , 4 , 2 , 3};
//          HashMap<Integer, Integer> map = new HashMap<>();
//         int sum = 3;
//         int current = 0;
//         int start = 0;
//         int end = 0;

//         for (int i = 0; i < arr.length; i++) {
//              current = current + arr[i];
//         if (current - sum == 0) {
//             start = 0;
//             end = i;
            
//         }
//         if (map.containsKey(current - sum)) {
//             start = map.get(current - sum) + 1;
//             end = i;
          
//         }
//         map.put(current, i);
//         }
//         System.out.println(start +" " +  " " +end);
//     }

// }
// package Array.arrayproblem;
// // so here we will do the longest sum of subarray another brute force approch 

// import java.util.HashMap;

// public class longssub {

//     public static void main(String[] args) {
//         int arr[] = { 1 , 2 , 3 , 1 , 1 , 1 , 1 , 4 , 2 , 3};
//          HashMap<Integer, Integer> map = new HashMap<>();
//         int sum = 3;
//         int maxlen = 0;
//         int prefix = 0;
//         int start = -1;
//         int end = -1;

//         map.put(0, -1);


//         for (int i = 0; i < arr.length; i++) {
//             prefix +=  arr[i];

//             if (map.containsKey(prefix - sum)) {
//                 int preindex = map.get(prefix - sum) ;
//                 int len  = i - preindex;    
//                 if (len > maxlen) {
//                     maxlen = len;
//                     start = preindex + 1;
//                     end = i;
//                 }
//             }
          
//             if (!map.containsKey(prefix)) {
//                 map.put(prefix, i);
//             }

//         }
//         System.out.println(start + " " + end);
//     }
// }
package Array.arrayproblem;
// so here we will do the longest sum of subarray another brute force approch 

import java.util.HashMap;
import java.util.Map;

public class longssub {
    public static void main(String[] args) {
         int arr[] = { 1 , 2 , 3 , 1 , 1 , 1 , 1 , 4 , 2 , 3};
         int k = 3;

          Map<Long, Integer> preSumMap = new HashMap<>();
          long sum = 0;
          int maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
          if (sum == k) {
            maxlen = i + 1;
          }

          long rem = sum - k;
          if (preSumMap.containsKey(rem)) {
            int len = i -  preSumMap.get(rem);
            maxlen = Math.max(maxlen, len);
          }
          if (!preSumMap.containsKey(sum)) {
              preSumMap.put(sum, i);
          }
        }
        System.out.println(maxlen);
    }
}