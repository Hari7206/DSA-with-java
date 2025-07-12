// package arraypractice.easy;
// // so here we will see the brute force approch of the missing array number 


// public class mised {
//     public static void main(String[] args) {
//         int arr[] = { 1 ,2  ,3 ,  5 , 6};
//         for (int i = 1; i < arr.length; i++) {
//             int missed = 0;
//         for (int j = 0; j < arr.length; j++) {
//             if (arr[j] == i) {
//                 missed = 1;
//                 break;
//             }
//         }
//             if (missed == 0) {
//            System.out.println("the missing number is " + i);
//         }
//         }
//     }
// }

// package arraypractice.easy;
// // so here we will see the betetr force approch of the missing array number 

// public class mised {
// public static void main(String[] args) {
//     int arr[] = { 1 , 2 , 3  , 4  , 6};
//     int n = 6;
//     int hash[] = new int[n+1];

//     for (int i = 0; i < arr.length; i++) {
//             hash[arr[i]] = 1;
//     }
//     for (int j = 1; j < hash.length; j++) {
//         if (hash[j] == 0) {
//             System.out.println("the missing number is " + j);
//         }
//     }
// }
// }

// package arraypractice.easy;
// // so here we will see the optimal approch of the missing array number 

// public class mised {

//     public static void main(String[] args) {
//          int arr[] = { 1 , 2 , 3  , 4  , 6};

//          int n = 6;
//          int sumOne = n*(n+1)/2;
//          System.out.println(sumOne);
//         int sumTwo = 0;
//          for (int  i = 0; i < arr.length; i++) {
//             sumTwo = sumTwo + arr[i];
//          }
//          System.out.println(sumTwo);
//          int results = sumOne - sumTwo;
//          System.out.println("the missing number is " + results);
    

//     }

// }

// package arraypractice.easy;
// // // so here we will see the optimal approch of the missing array number 
// // If bits are the same → result is 0
// // If bits are different → result is 1     this is for the purpose of remeber the xor 

// public class mised {

//     public static void main(String[] args) {
//         int arr[] = {1 ,2 , 3 , 5 , 6};
//         int n = arr.length + 1;
//         int xor1 = 0;
//         int xor2 = 0;
//         int result = 0;
//         for (int i = 0; i <= n; i++) {
//             xor1 = xor1 ^ i;
//         }

//             for (int j = 0; j < arr.length; j++) {
//             xor2 = xor2^arr[j];
//             }

//              result = xor1 ^ xor2;
//         System.out.println(result);

        
//     }
// }

package arraypractice.easy;
// // so here we will see the optimal approch of the missing array number 
// If bits are the same → result is 0
// If bits are different → result is 1     this is for the purpose of remeber the xor 

public class mised {
// moerm better verison of the xor to maintain in time complexity 
    public static void main(String[] args) {
        int arr[] = {1 ,2 , 3 , 5 , 6};
        int n = arr.length + 1;
        int xor1 = 0;
        int xor2 = 0;
        int result = 0;
            for (int j = 0; j < arr.length; j++) {
            xor2 = xor2^arr[j];
            xor1 = xor1 ^ (j+1);
            }
            xor1 = xor1 ^ n;
             result = xor1 ^ xor2;
        System.out.println(result);

        
    }
}