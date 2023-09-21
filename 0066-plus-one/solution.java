class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int len = digits.length;
        int sum = 0;
        int temp = 0;
        int carry  = 0;
        
        for(int i = len-1; i >= 0; i--) {
        	sum = carry+digits[i]+(i==len-1? 1: 0);
        	temp = sum%10;
        	carry = sum/10;
        	//System.out.println("sum: "+sum+", temp: "+temp+", carry: "+carry);
        	list.add(temp);
        }
        
        if(carry > 0) list.add(carry);
        
        int idx = 0;
        int[] ans = new int[list.size()];
        
        for(int i = list.size()-1; i >= 0; i--) {
        	ans[idx++] = list.get(i);
        }
        
        return ans;
    }
}
