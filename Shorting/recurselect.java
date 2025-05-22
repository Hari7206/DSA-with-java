package Shorting;
// here we will do the selection short using the recursion
public class recurselect {
    public static void main(String[] args) {
            int arr[] = {45 ,23 , 56 , 2 , 89 , 87 , 65 , 12,5};
       selction(arr, 0, arr.length);
       for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
       }
    }
    public static void selction(int arr[] , int beginIndex , int size) {
        if (beginIndex>=size) {
            return;
        }
        int minim = beginIndex;
        for (int i = beginIndex; i < arr.length; i++) {
            if (arr[i] < arr[minim]) {
                minim = i;
            }
        }
        int temp = arr[minim];
        arr[minim] = arr[beginIndex];
        arr[beginIndex] = temp;
        selction(arr, beginIndex+1, size);
    }
}
