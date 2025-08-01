package Array.mediumproblem.longestconsucutive;

public class brute {
    public static void main(String[] args) {
        int arr[] = {102 , 4 , 100 , 1 , 101 , 3 , 2 , 1 , 1};

        int longest = 1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int x = arr[i];

              if (linerserach(arr, x - 1)) {
                continue;
            }


            while (linerserach(arr, x+1)== true) {
                count = count +1;
                x = x+1;
            }
            longest = Math.max(longest, count);
        }

        System.out.println(longest);
    }


    public static boolean  linerserach(int arr[] , int nums) {
       for (int i = 0; i < arr.length; i++) {
         if (arr[i] == nums) {
             return true;
         }
        }
        return false;
    }
}
