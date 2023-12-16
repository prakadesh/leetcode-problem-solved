class Solution {
    public int maxProduct(int[] nums) {
        int minProd = nums[0], maxProd = nums[0];
        int ans = nums[0];

        int testMaxProd, testMinProd;
        for (int i = 1; i < nums.length; i++) {
            testMaxProd = maxProd * nums[i];
            testMinProd = minProd * nums[i];

            maxProd = Math.max(Math.max(testMaxProd, testMinProd), nums[i]);
            minProd = Math.min(Math.min(testMaxProd, testMinProd), nums[i]);

            ans = Math.max(ans, maxProd);
        }

        return ans;
    }
}
