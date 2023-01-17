package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class P46_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recrsiveFn(res, nums, 0);
        return res;
    }

    public void recrsiveFn(List<List<Integer>> res, int[] nums, int i) {

        if (i == nums.length) {
            res.add(tolist(nums));
        } else {
            for (int j = i; j < nums.length; j++) {
                swap(nums, i, j);
                recrsiveFn(res, nums, i + 1);
                swap(nums, i, j);
            }
        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<Integer> tolist(int nums[]) {
        List<Integer> ans = new ArrayList<>();
        for (int i : nums) {
            ans.add(i);
        }
        return ans;
    }
}
