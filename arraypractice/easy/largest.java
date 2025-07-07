// package arraypractice.easy;
// // so first we will see the brute force of this 
// public class largest {
//     public static void main(String[] args) {
//         int arr[] = {12 , 45 , 23 , 56 , 67  ,  87 , 21};
//         int n = arr.length-1;
//         for (int j = 0; j< arr.length; j++) {
//             for (int i = j+1; i < arr.length; i++) {
//                 if (arr[j] > arr[i]) {
//                     int temp = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = temp;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]); 
//         }
//         System.out.println("the largest is "+ arr[arr.length - 1 ]);
//     }
// }


// so here we will start the optimal version of the largest 
package arraypractice.easy;

public class largest {
public static void main(String[] args) {
     int arr[] = {12 , 45 , 23 , 56 , 67  ,  87 , 21 , 110};
     int largest = 0;
     for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
     }
     System.out.println("largrest is " + largest);
}
}