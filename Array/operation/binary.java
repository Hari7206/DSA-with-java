package Array.operation;

public class binary {
    public static void main(String[] args) {
        int arr[] = {12 , 54 , 67 , 89 , 90 , 110 , 210 , 340};
        int result = binSearch(arr, arr.length, 110);
        if (result != -1) {
            System.out.println("the array element is found at index " + result);
        }
        else {
            System.out.println("The element is not present");
        }
    }
    public static int binSearch(int arr[] , int size , int element) {
        int low , mid , high;
        low = 0;
        high = size -1;
        while (low<=high) {
             mid = (low+high) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] < element) {
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
         }
         return -1;
    }
}
