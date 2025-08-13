package Array.hardproblem.mergeIntervel;

import java.util.*;

public class optimal {
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();

        for (int[] interval : intervals) {
            if (ans.isEmpty() || interval[0] > ans.get(ans.size() - 1)[1]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }

        for (int[] it : ans) {
            System.out.println(it[0] + " " + it[1]);
        }
    }
}
