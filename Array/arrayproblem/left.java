package Array.arrayproblem;
// we have to rotate to the left side of the array 
public class left { 
public static void main(String[] args) {
        int arr[] = { 45 , 67 , 73, 34 , 7 , 23 ,3};
        int n = 7;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n-1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}
}
