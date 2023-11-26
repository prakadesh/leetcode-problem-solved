class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums2.length;i++)
            mp.put(nums2[i],i);

        int[] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++)
        {
            int k = mp.get(nums1[i]);

            int z  = k;
            while(k<nums2.length-1)
            {
                if(nums2[z]<nums2[k+1])
                {
                   ans[i]=nums2[k+1];
                   break;
                }
                k++;
            }

            if(k==nums2.length-1)
                ans[i]=-1;
            
        }

        return ans; 
    }
}
