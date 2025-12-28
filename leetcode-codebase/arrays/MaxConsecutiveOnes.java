// 485. Max Consecutive Ones
class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0 ;
        int max = 0 ;
        for (int i = 0 ; i<nums.length ; i++ ){
            if (nums[i]==1){
                cnt++;
                max = Math.max(cnt , max );
            } else {
                cnt = 0 ;
            }
           // max = cnt;
            
        }
 
        return max;
        
    }
}