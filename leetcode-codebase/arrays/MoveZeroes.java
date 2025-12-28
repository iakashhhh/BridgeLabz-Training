// Move Zero 283
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // int j = 0;
        // int n = nums.length;
        // for(int i = 0 ; i <n ; i++){
        //     if (nums[i]==0){
        //         j=i;
        //         break;
        //     }
            
        // }
        //     for(int i = j ; i < nums.length ; i++){
        //         if (nums[i]!=0){
        //             int temp =  nums[i];
        //             nums[i]=nums[j];
        //             nums[j] = temp ; 
        //             j++;
        //         }
        //     }
         int j = 0 ;
         for (int i = 0 ; i<nums.length ; i++){
            if (nums[i]!=0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp ;
                j++;

            }
         }
          


        
    }
}