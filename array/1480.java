class Solution {
    public int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int current_sum = 0;
        int index = 0;
        int[] output = new int[nums.length];

        while(index < nums.length) {
            int value = nums[index];
            current_sum += value;
            output[index] = current_sum;
            index += 1;
        }

        return output;
    }
}