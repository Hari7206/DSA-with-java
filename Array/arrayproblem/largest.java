package Array.arrayproblem;

public class largest {
        public static void main(String[] args) {
        int arr[] = { 56 , 67 , 34 , 3 , 78 , 3 , 190};
        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        System.out.println("The biggest number of the array is "+ biggest);
    
    }
}
