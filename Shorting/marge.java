package Shorting;

import java.util.ArrayList;
import java.util.Arrays;

// so here we do the merge  short . the main rule of the marge short is we have to do divide and marge combo the divide is done as the  recursion part and marge is done as the part of code which add the both the arr things
public class marge {
    public static void main(String[] args) {
        int arr[] = {3 ,1 , 2 , 4 , 1 , 5 , 2 , 6 , 4};
        margediv(arr, 0,  arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void marged(int arr[] , int low , int mid , int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left <= mid && right<=high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
             temp.add(arr[left]);
                left++;
        }
        while (right <= high) {
               temp.add(arr[right]);
                right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);  // or we can say low - low the same thing just the i will be irtate every time 
        }
    }
    public static void margediv(int arr[] , int low , int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        margediv(arr, low, mid);
        margediv(arr, mid + 1, high);
        marged(arr, low , mid , high);
    }
}