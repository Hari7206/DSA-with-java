// package Array.arrayproblem;

// import java.util.ArrayList;
// import java.util.List;

// public class intersec {
//     // so here we will see the intersection of the two array
//     public static void main(String[] args) {
//          List<Integer> results = new ArrayList<>();
//         int arr1[] = {1 , 2 , 3 , 4 , 5 ,  6 , 7};
//         int arr2[] = {1 , 1  , 3 ,  3 ,  5 ,  5 , 7 };

//         int visitied[] = new int[arr2.length];

//         for (int i = 0; i < arr1.length; i++) {
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i] == arr2[j] && visitied[j]==0) {
//                     results.add(arr1[i]);
//                     visitied[j] = 1;
//                     break;
//                 }
//                 else if (arr2[j] > arr1[i]) {
//                     break;
//                 }

//             }
//         }
//         System.out.println(results);

//     }
// }

package Array.arrayproblem;
import java.util.ArrayList;
import java.util.List;

public class intersec {
public static void main(String[] args) {
     List<Integer> results = new ArrayList<>();
    int arr1[] = { 1  ,2 , 3 , 3 , 4  ,  5  , 6    , 8 };
    int arr2[] = { 1 , 1 , 3 ,3 , 4  , 5  ,  6 , 7 , 8 };

    int i = 0;
    int j = 0;

    while (i < arr1.length  && j < arr2.length) {
        if (arr1[i] == arr2[j]) {
            results.add(arr1[i]);
            i++;
            j++;
        }
        else  if (arr1[i] < arr2[j]) {
            i++;
        }
        else {
            j++;
        }
    }
    System.out.println(results);


}
}