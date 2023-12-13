class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int lastzero = -1;
        int maxlen = 0;
        int currlen = 0;
        for(int i = 0; i< n; i++){
            if(nums[i]==0){
                maxlen = Math.max(maxlen,currlen);
                currlen = i - lastzero - 1;
                lastzero = i;
            }else{
                currlen++;

            }
            
        }
        maxlen = Math.max(maxlen,currlen);
        return n == maxlen ? n -1 :maxlen;
    }
}
