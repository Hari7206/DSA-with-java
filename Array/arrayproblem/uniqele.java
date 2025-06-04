package Array.arrayproblem;
// here we have to remove the unique eleement 
public class uniqele {
    public static void main(String[] args) {
        int arr[] = { 1 , 1 , 2 , 2 , 3 ,  3, 3 , 4};
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i] ) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }
}
