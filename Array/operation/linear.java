package Array.operation;

public class linear {
    public static void main(String[] args) {
        int arr[] = {56 , 55 , 67 , 34 , 7 , 345 };
       int result = search(arr, 34);
        System.out.println(result);
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

