package Array.hardproblem.mergeIntervel;

import java.util.*;

public class brute {
    public static void main(String[] args) {
        
        List<int[]> arr = new ArrayList<>();
        arr.add(new int[]{1, 3});
        arr.add(new int[]{2, 6});
        arr.add(new int[]{8, 10});
        arr.add(new int[]{15, 18});

        int n = arr.size();
        
        arr.sort((a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int start = arr.get(i)[0];
            int end = arr.get(i)[1];
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j)[0] <= end) {
                    end = Math.max(end, arr.get(j)[1]);
                } else {
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }
        for (int[] interval : ans) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
