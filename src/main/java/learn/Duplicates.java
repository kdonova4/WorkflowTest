package learn;

import java.util.HashSet;

public class Duplicates {

    public static HashSet<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : nums) {
            if(!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
