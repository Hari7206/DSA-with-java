package Array.hardproblem.ThreeSUm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class brute {
    public static void main(String[] args) {
        int arr[] = {-1 , 0 , 1 , 2 ,   -1 ,  -4 };
         Set<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                     List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    Collections.sort(triplet);
                    resultSet.add(triplet);
                }
                    
                }
            }
        }
        System.out.println(resultSet);
    }
}
