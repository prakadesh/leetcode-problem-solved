class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrpre[] = new int[nums.length];
        int arrpos[] = new int[nums.length];
        arrpre[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            arrpre[i] = nums[i] * arrpre[i-1];
        }
        arrpos[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            arrpos[i] = nums[i] * arrpos[i+1]; 
        }
        for(int i=0;i<nums.length;i++){
            int pre;
            if(i==0){
                pre = 1;
            }
            else{
                pre = arrpre[i-1];
            }
            int pos;
            if(i==nums.length-1){
                pos = 1;
            }
            else{
                pos = arrpos[i+1];
            }
            nums[i] = pre*pos;
        }
        return nums;
    }
}
