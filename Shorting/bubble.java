package Shorting;

public class bubble {
    public static void main(String[] args) {
        int arr[] = {12 , 45 , 56 , 23 , 67 , 2 , 89 , 34 , 90};
        bubblesort(arr, arr.length);
    }
    public static void bubblesort(int arr[] , int n) {
        for (int i = n-1; i >=1; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j+1]) {
                   int temp = arr[j+1];
                  arr[j+1] = arr[j];
                   arr[j] = temp;  
                }
            }
        }
        //
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
    }
    }
}
