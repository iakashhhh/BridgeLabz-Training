// 268 Missing Number
class MissingNumber {
    public int missingNumber(int[] nums) {
       int sum = 0 ;
       int n = nums.length ;
       int s1 = 0;
        sum = n*(n+1)/2;
       for (int i = 0 ; i<nums.length ; i++){
         s1 = s1+nums[i];

       }
       return sum-s1;
      
        


        
    }
}