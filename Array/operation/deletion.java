package Array.operation;
// here we will do the deletion in the array
public class deletion {
    public static void main(String[] args) {
        int arr[] =  { 35 , 67 , 23 , 78  , 2 , 7 , 25};
        int size = 7;
        dele(arr, size, 3);
        for (int i = 0; i < size-1; i++) {
            System.out.println(" " + arr[i]);
        }
        
    }
    public static int dele(int arr[] , int size , int index) {
        for (int i = index; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
       return size - 1;
    }
}
