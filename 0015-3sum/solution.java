class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        //sort out the array
    	Arrays.sort(nums);

    	//initialise an empty array
    	List<List<Integer>> result = new ArrayList<>();

    	//loop through the array
    	//int left, second, third, sum = 0;

    	for (int i = 0; i < nums.length - 2; i++) {
    		//apply the condition of i != j and i != k first,

    		if ( (i == 0) || (i > 0 && nums[i] != nums[i-1]) ) { //check duplicates	
    			int left = i + 1;
    			int right = nums.length - 1;
    			int target = -nums[i]; //calculate the target sum
    		

	    		while (left < right){
	    			if (nums[left] + nums[right] == target) {
	    				result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));

	    				//adjust pointers to avoid duplicates
	    				while( (left < right) && nums[left] == nums[left + 1]){left++;}
	    				while ((left < right) && nums[right] == nums[right -1]){right--;}

	    				left++;
	    				right--;
	    			}
	    			else if(nums[left] + nums[right] < target)  {
	    				left++;
	    			}
	    			else {
	    				right--;
	    			}
	    			
	    		}
	    	}
    	}
        return result;  	
    }
}
