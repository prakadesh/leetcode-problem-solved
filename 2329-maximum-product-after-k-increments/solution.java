class Solution {
    public int maximumProduct(int[] nums, int k) {
        Arrays.sort(nums);

        int index = 0;
        while (k-- > 0) {
            nums[index]++;
            if (index + 1 < nums.length && nums[index] > nums[index + 1] ) index++;
            else index = 0;
        }

        index = 0;
        long product = nums[index++];
        while (index < nums.length) {
            product *= nums[index++];
            product = product % 1_000_000_007;
        }

        return (int) product;
    }
}
