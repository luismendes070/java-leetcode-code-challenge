package org.example;

class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        long ans = 0;
        try {
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    ans += Math.min(cost[i], cost[i + 1]);
                    if (cost[i] > cost[i + 1]) {
                        nums[i] = nums[i + 1];
                    } else {
                        nums[i + 1] = nums[i];
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return ans;
    }
}
