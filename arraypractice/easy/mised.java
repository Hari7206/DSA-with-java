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
// // so here we will see the brute force approch of the missing array number 

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

package arraypractice.easy;
// so here we will see the brute force approch of the missing array number 

public class mised {

    public static void main(String[] args) {
         int arr[] = { 1 , 2 , 3  , 4  , 6};

         int n = 6;
         int sumOne = n*(n+1)/2;
         System.out.println(sumOne);
        int sumTwo = 0;
         for (int  i = 0; i < arr.length; i++) {
            sumTwo = sumTwo + arr[i];
         }
         System.out.println(sumTwo);
         int results = sumOne - sumTwo;
         System.out.println("the missing number is " + results);
    

    }

}