package Array.arrayproblem;
//
public class linear {
    public static void main(String[] args) {
        int arr[] = {45 , 67 , 84 , 90 ,  23 , 5 , 78 };
        int number = 23;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == number) {
            System.out.println(arr[i] +" is found at index " + i);
           }
        }
    }
}
