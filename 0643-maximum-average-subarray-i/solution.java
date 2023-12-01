class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int fwin = 0;
       int max = Integer.MIN_VALUE;
       int n = nums.length;
       for(int i = 0;i < k; i++){
           fwin += nums[i];
       }

       max = Math.max(fwin,max);
       for(int i=0; i< n-k; i++){
           fwin += (nums[i+k]- nums[i]);
           max = Math.max(fwin,max);
       }    return (double)max/k;

    }
}
