class Solution {
    public int pivotIndex(int[] nums) {
        int[] forward_sum_array = new int[nums.length];
        int[] backward_sum_array = new int[nums.length];

        forward_sum_array[0] = nums[0];
        backward_sum_array[nums.length-1] = nums[nums.length-1];

        for (int i=1; i<=nums.length-1; i++) {
            forward_sum_array[i] = forward_sum_array[i-1] + nums[i];
            backward_sum_array[nums.length-1-i] = backward_sum_array[nums.length-i] + nums[nums.length-1-i];
        }

        for (int j=0; j<=nums.length-1; j++) {
            if (forward_sum_array[j] == backward_sum_array[j]) {
                return j;
            }
        }

        return -1;
    }
}