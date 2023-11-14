class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        makeCombination(candidates,target,new ArrayList<Integer>(),0,0);
        return result; 
    }

    private void makeCombination(int [] candidates, int target, List<Integer> ls,int sum,int idx)
    {
        if(sum==target) {
            result.add(new ArrayList<Integer>(ls));
            return;
        }
        if(idx>=candidates.length || sum>target) return;

        sum+=candidates[idx];
        ls.add(candidates[idx]);
        makeCombination(candidates,target,ls,sum,idx+1);
        sum-=candidates[idx];
        ls.remove(ls.size()-1);
        int i=0;
        while(idx+i<candidates.length && candidates[idx]==candidates[idx+i])
            i++;
        makeCombination(candidates,target,ls,sum,idx+i);
    }
}
