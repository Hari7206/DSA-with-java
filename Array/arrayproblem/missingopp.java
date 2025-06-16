package Array.arrayproblem;
// so this is the optimal verion using the sum method 
public class missingopp {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 5};
        int n = 5;
        int sum = n * (n+1) / 2;
        int sumTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTwo = sumTwo + arr[i];
        }
        int  missing = sum - sumTwo;
        System.out.println(" missing number is " +  missing);
    }
}
