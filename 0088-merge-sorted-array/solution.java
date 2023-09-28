class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int i=0 , j=0 ,k=0;
            while (k <m+n){
                if(j == n){
                    result[k]=nums1[i];
                    i++;
                    k++;
                }
                else if(i==m){
                        result[k] = nums2[j];
                        j++;
                        k++;
                    }
                else if(nums1[i]<=nums2[j]){
                        result[k] = nums1[i];
                        i++;
                        k++;
                    }
                else{
                        result[k]=nums2[j];
                        k++;
                        j++;
                    }
                }
        for (int l = 0; l < m+n; l++) {
           nums1[l]=result[l];
        }
        
    }

}
