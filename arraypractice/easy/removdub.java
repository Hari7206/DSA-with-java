// package arraypractice.easy;

// import java.util.*;

// // so here we will use the brute force version for this 
// public class removdub {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();
//     int arr[] = { 1 , 2 , 3 , 3  , 4  , 4  , 4 , 5};
//     for (int i = 0; i < arr.length; i++) {
//         set.add(arr[i]);
//     }
//   for (int elem : set) {
//       System.out.println(elem);
//   }
//     }

// }
package arraypractice.easy;
// here we will done the optimal version of the remove dublicate 
public class removdub { 
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 3 , 3  , 4  , 4  , 4 , 5};
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] !=  arr[j]) {
                arr[j+1] = arr[i];
                j++;
            }
        }
        for (int i = 0; i <=j; i++) {
            System.out.println(arr[i]);
        }
    }
}