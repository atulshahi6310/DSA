class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i =0 ; i<nums.length; i++){
            current_sum = current_sum + nums[i];
            max_sum = Math.max(max_sum , current_sum);
            if(current_sum < 0 ){
                current_sum = 0;
            }

        }
        return max_sum;
    }
}