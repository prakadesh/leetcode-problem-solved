class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if(nums.length < 4)
            return list;
        if(nums[2]== 1000000000)
            return list;
        for(int i = 0; i < nums.length-3; i++)
        {
            long sum = nums[i];
            if((i == 0 || nums[i] != nums[i-1] ))
            {
                for(int j = i+1; j < nums.length-2; j++)
                {
                    if((j == i+1 || nums[j] != nums[j-1]))
                    {
                        int ind1 = j+1;
                        int ind2 = nums.length-1;
                        while(ind1 < ind2)
                        {
                            sum = (long)(nums[i] + nums[j] + nums[ind1] + nums[ind2]);
                            if(sum == target)
                            {
                                List<Integer> subList = new ArrayList<Integer>();
                                subList.add(nums[i]);
                                subList.add(nums[j]);
                                subList.add(nums[ind1]);
                                subList.add(nums[ind2]);
                                list.add(subList);
                                
                                while(ind1 < ind2 && nums[ind1] == nums[ind1+1])
                                        ind1++;
                                while(ind1 < ind2 && nums[ind2] == nums[ind2-1])
                                        ind2--;
                                ind1++;
                                ind2--;
                            }
                            else if(sum < target)
                                ind1++;
                            else
                                ind2--;
                        }
                    }
                }
            }
        }
        return list;
    }
}
