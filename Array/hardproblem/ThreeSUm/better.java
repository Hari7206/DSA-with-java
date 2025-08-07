package Array.hardproblem.ThreeSUm;

import java.util.*;

public class better {
    
    public List<List<Integer>> triplet(int n, int[] num) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = -(num[i] + num[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(num[i], num[j], third);
                    Collections.sort(temp); 
                    set.add(temp); 
                }

                hashset.add(num[j]);
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        better obj = new better();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = obj.triplet(arr.length, arr);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
