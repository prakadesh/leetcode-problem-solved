class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>result= new ArrayList<>();
         List<Integer>list= new ArrayList<>();
           for(int num: nums){
               list.add(num);
           }
           
           Set<Integer>s= new HashSet<>();
           while(!list.isEmpty()){
               List<Integer>ans= new ArrayList<>();
               for(int i=0;i<list.size();i++){
                   if(!s.contains(list.get(i))){
                   s.add(list.get(i));
                   ans.add(list.get(i));
                   list.remove(i);

                   i--;   
               }
               }
               result.add(ans);
               s.clear();         
           }
        return result;
    }
}
