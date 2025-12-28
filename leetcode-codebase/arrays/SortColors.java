// 65 Sort colors
class SortColors {
    public void sortColors(int[] nums) {
        int i = 0 ;
        int j = nums.length-1;
        int idx = 0 ;
        while (idx<=j){
            if (nums[idx]==0){
                int temp = nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;
                i++; idx++;
            } else if(nums[idx]==2){
                int temp =nums[j];
                nums[j]=nums[idx];
                nums[idx]=temp;
                j--;

            }else {
                idx++;
            }
        }
    }
}
