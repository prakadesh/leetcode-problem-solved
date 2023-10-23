class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length ;
        int m = nums2.length;
        int k = m+n;
        int l = k /2;
        double res ;
        int nums3[] = new int[k];

        System.arraycopy(nums1,0,nums3,0,n);
        System.arraycopy(nums2,0,nums3,n,m);

       Arrays.sort(nums3,0,k);

      if(k % 2==0 ){

          res = ((double)(nums3[l]+nums3[l-1]))/2;
           

      }else{
             res = nums3[l];
      }

        return res;
    }
}
