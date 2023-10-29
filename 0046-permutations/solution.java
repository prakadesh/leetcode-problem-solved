class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        boolean[] map=new boolean[nums.length];
        Permutation(nums, ans, ds, map);  
        return ans;  
    }
    void Permutation(int[] nums, List<List<Integer>> ans, ArrayList<Integer> ds, boolean []map)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!map[i])
            {
                map[i]=true;
                ds.add(nums[i]);
                Permutation(nums, ans, ds, map); 
                ds.remove(ds.size()-1);
                map[i]=false;
            }
        }
    }
}
