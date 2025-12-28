// Target Sum
class TargetSum {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        helper(n-1,target,nums);
        return count;
    }
    public void helper(int i, int target, int[] nums){
        if(i < 0){
            if(target == 0)count++;
            return;
        }
        helper(i-1,target+nums[i],nums);
        helper(i-1,target-nums[i],nums);
    }
}