// package Array.arrayproblem;
// // so here we will do the longest sum of subarray

// public class longsub {
//     public static void main(String[] args) {
//         int arr[] = {1 , 2 , 5 , 6 , 1 , 1 , 4 , 3 , 6};
//         int length = 0;
//         int target = 6;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int submission = 0;
//                 for (int k = i; k <= j; k++ ) {
//                     submission = submission + arr[k];
//                 }
//                 if (submission == target) {
//                     length = Math.max(length, j-i+1);
//                 }
//             }
//         }
//         System.out.println(length);
// this tc = 0(n^2)


//     }
// }

package Array.arrayproblem;
// so here we will do the longest sum of subarray another brute force approch 

public class longsub {

public static void main(String[] args) {
    int arr[] = {1 , 2 , 5 , 6 , 1 , 1 , 4 , 3 , 6};
    int target = 12;
    int length = 0;
    for (int i = 0; i < arr.length; i++) {
        int submission = 0;
        for (int j = i; j < arr.length; j++) {
            submission = submission + arr[j];
            if (submission == target) {
                length = Math.max(length, j-i+1);
            }
        }
    }
    System.out.println(length);
// this tc = 0(n^2)
}

}
