package Array.mediumproblem.Twosum;
public class twoSum {
    public static void main(String[] args) {
        int arr[] = {2 , 6 , 5 , 8 , 11};
        int target = 14;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("yes there is sum of two number present ");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
    }
}
