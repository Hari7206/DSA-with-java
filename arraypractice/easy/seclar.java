// package arraypractice.easy;
// // so first of all we do the secoond largrest brute force approch
// public class seclar {
//     public static void main(String[] args) {
//         int arr[] = { 34 , 23 , 5 , 67 , 78 , 54 , 78};

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//        int largest = arr[arr.length-1];
//        int selar = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//         if (arr[i] < largest) {
//              selar = arr[i];
//         }
//        }
//        System.out.println("second largest is "+selar);
//     }
// }

package arraypractice.easy;
// so first of all we do the secoond largrest optimal force approch
public class seclar {
public static void main(String[] args) {
     int arr[] = { 34 , 23 , 5 , 67  , 54 , 45};
     int largest = arr[0];
     int seclar = -1;

     for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            seclar = largest;
            largest = arr[i];
        }
        else if (arr[i] <  largest && arr[i] > seclar) {
            seclar = arr[i];
        }
     }
System.out.println(seclar);
System.out.println(largest);
    }
}