package leetcode;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {

        if (nums == null || nums.length <= 0) {
            return false;
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {

                if (nums[i] < nums[i + 1]) {
                    isDecreasing = false;
                }
                else if (nums[i] > nums[i + 1]) {
                    isIncreasing = false;
                }
            }
        }

        return isIncreasing || isDecreasing;
    }
}
