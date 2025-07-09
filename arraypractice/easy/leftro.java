// package arraypractice.easy;
// // so here we will do the left rotate by one place 
// public class leftro {
//     public static void main(String[] args) {
//         int arr[] = {1 , 2 , 4  , 5 , 6 };
//         int temp = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             arr[i-1] = arr[i];
//         }
//         arr[arr.length-1] = temp;

//     for (int i = 0; i < arr.length; i++) {
//         System.out.println(arr[i]);
//     }
//     }
// }

package arraypractice.easy;

import java.util.ArrayList;
import java.util.List;

// so now here we do the left rotete by d place as the brute force approch
public class leftro {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
      

        int arr[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 };
        // so left rotate it by 3 place 
        int d = 3;
        int n = arr.length;
        
        for (int i = 0; i < d; i++) {
            temp.add(arr[i]);
        }
       for (int i = d; i < n; i++) {
        arr[i - d] = arr[i];
       }

       for (int i = n - d; i < n; i++) {
        arr[i] = temp.get(i-(n-d));
       }
for (int elem : arr) {
    System.out.println(elem);
}
    }
}