package Array.arrayproblem;
public class slargest {
    public static void main(String[] args) {
        int  arr[] = {45 , 56 , 23 , 67 , 5 , 98 , 3 , 99, 120 , 100};
        int largest = arr[1];
        int slargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(slargest);
    }
}
