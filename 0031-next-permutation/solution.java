class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int x = 0;
        int y = 0;
        boolean foundPair =  false;

        for(int i=1;i<n;i++){
            int ele = nums[n-i];

            for(int j=n-1-i;j>=0;j--){
                if(nums[j]<ele){
                    if(j>x || (j==x && (foundPair==false || ele<nums[y]))){
                        x = j;
                        y = n-i;
                        foundPair = true;
                    }
                }
            }
        }

        if(foundPair){
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;

            Arrays.sort(nums, x+1, n);
            return ;
        }

        Arrays.sort(nums);
        return ;

    }
}
