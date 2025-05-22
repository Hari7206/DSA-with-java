package Shorting;
// so here we will do the bubble short using the recursion function to make it more easy here we don't need 2 loop one loop is done by the recursion
public class recurBuble {
    public static void main(String[] args) {
        int arr[] = {45 ,23 , 56 , 2 , 89 , 87 , 65 , 12,5};
        buble(arr, arr.length-1);
       for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
       }
    }
    public static void buble(int arr[] , int number) {
        if (number==0) {
            return;
        }
        for (int i = 0; i < number; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        buble(arr, number-1);
    }
}
