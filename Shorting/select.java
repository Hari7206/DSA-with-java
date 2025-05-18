package Shorting;
// once again selection short using the nornmal type 
public class select {
    public static void main(String[] args) {
        int arr[] = {45 , 56 , 23 , 67 , 12 , 8 , 11};
        selc(arr, arr.length);
    }
    public static void selc(int arr[] , int n) {
        for (int i = 0; i < n-1; i++) {
            int minim = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minim]) {
                    minim = j;
                }
            }
            int temp = arr[minim];
            arr[minim] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
