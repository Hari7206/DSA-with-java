package Array.operation;

public class insertion {
    public static void main(String[] args) {
        
        int arr[] = { 35 , 67 , 23 , 78  , 2 , 7 , 25};
        System.out.print("Array before insertion");
        for (int elem : arr) {
            System.out.print(" " +elem);
        }
        System.out.println();
        int size = 5;
        int index = 2;
        indinsert(arr, size, 4, 100, index);
        System.out.print("Array After insertion");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        
    }
    public static int indinsert(int arr[] , int size , int element , int capacity , int index) {
        if(size>=capacity) {
            return -1;
        }
        for (int i = size-1; i >=index; i--) {
         arr[i+1] = arr[i];
        }
        arr[index] = element;
        size++;
        return 1;
    }
}
