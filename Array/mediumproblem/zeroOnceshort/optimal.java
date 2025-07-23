package Array.mediumproblem.zeroOnceshort;
// here we do the optiaml verison of the 0's , 1's and 2's shorting array 
public class optimal {
    public static void main(String[] args) {
        int arr[] = {0 , 1 , 1  , 0 , 1 , 2 , 1 , 2, 0 , 0 ,0 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        // here startt the condition where till run
        while (mid <= high) {
            // here step 1
          if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            //  step = 2
            else if (arr[mid] == 1) {
                mid++;
            }
            // step = 3
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
