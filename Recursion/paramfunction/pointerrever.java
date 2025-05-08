package Recursion.paramfunction;
// so here we will reverse the array with the help of only i or we can call it as the single pointer arr 

public class pointerrever {
    public static void main(String[] args) {
        int arr[] = {4 , 6 , 3 , 7 , 8};
       reversingle(arr, 0, arr.length); 
       for (Object elem : arr) {
           System.out.println(elem);
       }
    }
    public static void reversingle(int arr[] , int i , int n){
        if (i>=n/2) {
            return;
        }
        int temp = arr[i];  
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reversingle(arr, i+1, n);
    }
}
