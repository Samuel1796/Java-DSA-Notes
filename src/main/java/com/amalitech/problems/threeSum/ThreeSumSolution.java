package com.amalitech.problems.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSolution {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSumSolution solution = new ThreeSumSolution();
        System.out.println(solution.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int inputLength = nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < inputLength - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = inputLength - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}
