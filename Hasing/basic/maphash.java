package Hasing.basic;
import java.util.*;
public class maphash {
    public static void main(String[] args) {
        // Your style of input array
        int arr[] = {45, 56, 34, 56, 56, 324, 56, 34, 67, 34, 67, 23, 67};

        // Striver-style map frequency counter
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Precomputing frequency
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key); // get current count if it exists
            }
            freq++; // increase the count
            mp.put(key, freq); // update or insert the key with new count
        }

        // Query part (your way, no Scanner)
        int query[] = {56, 67, 23, 99};

        for (int i = 0; i < query.length; i++) {
            int number = query[i];
            if (mp.containsKey(number)) {
                System.out.println(number + " appears " + mp.get(number) + " times");
            } else {
                System.out.println(number + " appears 0 times");
            }
        }
    }
}
