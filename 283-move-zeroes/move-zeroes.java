class Solution {
    public void moveZeroes(int[] nums) {
        int cur=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=cur){
                    int temp=nums[i];
                    nums[i]=nums[cur];
                    nums[cur]=temp;
                    
                }
                cur++;
            }
            
        }
    }
}