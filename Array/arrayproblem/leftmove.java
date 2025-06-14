package Array.arrayproblem;
public class leftmove {
    // so here we will see how we can move our non  zero value to the last 
    // otimal solution
    public static void main(String[] args) {
        int arr[] = {45 , 67 , 0 , 34 , 87 , 0 , 23 , 0 , 49 , 23};
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
               j = i;
               break;
            }
        }
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
