class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        int maxPairSum = 0;
        int i = 0 ,  j = n-1;
        Arrays.sort(nums);
        while(i < j) {
            maxPairSum = Math.max(maxPairSum, nums[i++] + nums[j--]);
        }
        return maxPairSum;
    }
}
