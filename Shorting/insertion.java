package Shorting;
// so here we do the insertion short 
public class insertion {
    public static void main(String[] args) {
        int arr[] = {23 , 7 , 56 , 12 , 78 , 11 , 5 , 3 , 41, 8};
        intert(arr, arr.length);
    }
    public static void intert(int arr[] , int n ) {
        for (int i = 0; i < n; i++) {
            int j=i;
            while (j > 0  && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
