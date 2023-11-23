class Solution {
    public int minimumDeletions(int[] nums) {
        int max = 0;
        int min = 0;
        int n = nums.length;

        for (int i=0; i<n; i++) {
            if(nums[i] > nums[max])
            max = i;
            if(nums[i] < nums[min])
            min = i;
        }

        int minIndex = Math.min(min, max);
        int maxIndex = Math.max(min, max);
        
        return Math.min (Math.min(maxIndex+1, n-minIndex), minIndex+1 + n-maxIndex);
    }
}
