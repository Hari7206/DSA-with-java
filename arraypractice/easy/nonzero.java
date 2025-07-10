// package arraypractice.easy;


// import java.util.ArrayList;
// import java.util.List;
// // so here we will do the non zero stroing at last brute force 
// public class nonzero {
//      public static void main(String[] args) {
//         List<Integer> temp = new ArrayList<>();
//         int arr[] = { 23,  45 ,  0  , 67 , 0 , 234 , 23 , 0 , 78 , 23 , 0 , 2 };

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 temp.add(arr[i]);
//             }
//         }
//         for (int i = 0; i < temp.size(); i++) {
//             arr[i] = temp.get(i);

//         }
//         for (int  i = temp.size(); i < arr.length; i++) {
//             arr[i] = 0;
//         }

//       for (int i = 0; i < arr.length; i++) {
//         System.out.println(arr[i]);
//       }
//     }
// }

package arraypractice.easy;


// so here we will do the non zero stroing at last optimal 
public class nonzero {
    public static void main(String[] args) {
        int arr[] =  { 23,  45 ,  0  , 67 , 0 , 234 , 23 , 0 , 78 , 23 , 0 , 2 };

        // here we will assign the j

        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
// here our logic will start 
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

       for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
       }

    }
}