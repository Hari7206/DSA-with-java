package Recursion.paramfunction;
// reverse the array using the recursion
public class reverse {
    public static void main(String[] args) {
        int[] arr = { 4 , 5  , 6 , 3 , 2};   // swap value will   2 3 6 5 4
        reverarr(arr,0, arr.length-1);
        for (Object val : arr) {
            System.out.println(val);
        }
    }
    public static void reverarr(int arr[],int l , int r ) {
        if (l>=r) {
            
        }
        else {
           int temp = arr[l];
           arr[l] = arr[r];
           arr[r] = temp;
            reverarr(arr,l+1, r-1);
        }
    }
}
