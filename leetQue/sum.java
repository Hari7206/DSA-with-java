package leetQue;
// 1480. Running Sum of 1d Array
public class sum {
    public static void main(String[] args) {
        int arr[] = {2 , 4 , 6 , 7 };
        int[] ps = new int[arr.length];

         ps[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i-1] + arr[i];
        }
        for (Object elem : ps) {
            System.out.println(elem);
        }
    }
}
