package Array.operation;

public class linear {
    public static void main(String[] args) {
        int arr[] = {56 , 55 , 67 , 34 , 7 , 345 };
       int result = search(arr, 34);
       if (result != -1) {
        System.out.println("the array element found at index " + result);
       }
       else{
        System.out.println("array element is not found ");
       }
    }
    public static int search(int arr[] , int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}

