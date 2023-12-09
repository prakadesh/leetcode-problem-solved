class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> countMap1 = new HashMap<>();
        HashMap<Integer, Integer> countMap2 = new HashMap<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i = 0;  i < n1; i++ ){
            int num = nums1[i];
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < n2; i++) {
            int num = nums2[i];
            countMap2.put(num, countMap2.getOrDefault(num, 0) + 1);
        }
        int Count1 = 0;
        int Count2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            if (countMap2.containsKey(num)) {
                Count1++;
            }
        }

        // Count common elements in nums2
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (countMap1.containsKey(num)) {
                Count2++;
            }
        }

        return new int[]{Count1, Count2};
    }
}
