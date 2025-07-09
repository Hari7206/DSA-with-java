package arraypractice.easy;
// so here we will do the left rotate by one place 
public class leftro {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 4  , 5 , 6 };
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    }
}
