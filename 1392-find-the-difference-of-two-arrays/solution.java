class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int alen=nums1.length;
        int blen=nums2.length;
        Set<Integer> hm1=new HashSet<>(alen);
        Set<Integer> hm2=new HashSet<>(blen);

        for(int i=0;i<alen; ++i){
            hm1.add(nums1[i]);
        }

         for(int i=0;i<blen; ++i){
            hm2.add(nums2[i]);
        }

        List<List <Integer>> l=new ArrayList<>();
        List <Integer> l1=new ArrayList<>();
        List <Integer> l2=new ArrayList<>();

        for(int i=0;i<alen; ++i){
            if(!hm2.contains(nums1[i]) && !l1.contains(nums1[i])  ) {l1.add(nums1[i]);}
        }
        
        for(int i=0;i<blen; ++i){
            if(!hm1.contains(nums2[i]) && !l2.contains(nums2[i])) {l2.add(nums2[i]);}
        }
        l.add(l1); l.add(l2);
        return l;

    }
}
