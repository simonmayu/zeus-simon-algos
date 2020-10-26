package zeus.simon.algos.algos01and10;


/**
 * 有序数组中求和为给定值的两个数
 * 一个整数数组和一个目标值,需要找到数组里两个整数,它们的和等于目标值,返回这两个整数的下标
 */
public class Algos03_TwoNumSumToGivenValue {


    // Time:O(n),Space:O(1)
    public int[] getTwoNumSumToGivenValue(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[]{-1, -1};

        int i = 0, j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) --j;
            else if (nums[i] + nums[j] < target) ++i;
            else return new int[]{i + 1, j + 1};

        }
        return new int []{-1,-1};
    }
}
