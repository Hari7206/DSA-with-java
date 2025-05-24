package Shorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quicks {
    public static void main(String[] args) {
       List<Integer> arr = new ArrayList<>(Arrays.asList(45, 67, 34, 66, 12, 78, 4, 89, 6));
        qs(arr , 0 , arr.size() - 1);
        System.out.println(arr);

    }
    public static int partion(List<Integer> arr , int low , int high) {

        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i  <= high-1) {
                i++;
            }
            while (arr.get(j) > pivot && j  >= low+1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i , arr.get(j));
                arr.set(j , temp);
               
            }
        }
         int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;

    }
    public static void qs(List<Integer> arr , int low , int high) {
        if (low >= high) {
            return;
        }
        int iIndex = partion(arr , low , high);
        qs(arr , low , iIndex - 1);
        qs(arr ,  iIndex + 1 , high);
    }
}
