import java.util.*;

class NumbersSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> firstIndex = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) firstIndex.putIfAbsent(sorted[i], i);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) result[i] = firstIndex.get(nums[i]);
        return result;
    }
}