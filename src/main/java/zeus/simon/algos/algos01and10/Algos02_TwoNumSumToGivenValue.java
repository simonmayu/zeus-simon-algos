package zeus.simon.algos.algos01and10;


import java.util.HashMap;
import java.util.Map;

/**
 * 求和为给定值的两个数
 * 一个整数数组和一个目标值,需要找到数组里两个整数,它们的和等于目标值,返回这两个整数的下标
 */
public class Algos02_TwoNumSumToGivenValue {


    // Time: O(n^2),Space:O(1)
    public int[] getTwoNumSumToGivenValueBruteForce(int[] nums, int target) {

        if (nums == null || nums.length < 2) return new int[]{-1, -1};
        for (int i = 0; i < nums.length; ++i)
            for (int j = i + 1; j < nums.length; ++j)
                if (nums[i] + nums[j] == target) return new int[]{i, j};
        return new int[]{-1, -1};
    }

    // Time:O(n),Space:O(n)
    public int[] getTwoNumSumToGivenValueHashMap(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {

            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
