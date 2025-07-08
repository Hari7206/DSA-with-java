// package arraypractice.easy;

// public class shorti {
//     public static void main(String[] args) {
//         int arr[] = { 1 , 2 , 2 ,  3 , 3 , 4  , 4};
//         boolean isShorted = true;
//         for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i+1]) {
//             isShorted = false;
//            }
//         }
//         if (isShorted == true) {
//             System.out.println("its an shorted array");
//         }
//         else if(isShorted == false) {
//             System.out.println("its not an shorted array");
//         }
//     }
// }

// here we will give the other code where we seee if the not part also work or not 
package arraypractice.easy;

public class shorti {
    public static void main(String[] args) {
        int arr[] = { 1 , 2 , 1 ,  3 , 3 , 4  , 4};
        boolean isShorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
           if (arr[i] > arr[i+1]) {
            isShorted = false;
           }
        }
        if (isShorted == true) {
            System.out.println("its an shorted array");
        }
        else if(isShorted == false) {
            System.out.println("its not an shorted array");
        }
    }
}
