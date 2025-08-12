import java.util.*;
// here we will apply the better version 
public class better {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        Set<String> seen = new HashSet<>();

        Arrays.sort(nums); 

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    int fourth = target - nums[i] - nums[j] - nums[k];
                    if (hashset.contains(fourth)) {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], fourth);
                        Collections.sort(quad); 
                        String key = quad.toString();
                        if (!seen.contains(key)) {
                            result.add(quad);
                            seen.add(key);
                        }
                    }
                    hashset.add(nums[k]);
                }
            }
        }


        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
