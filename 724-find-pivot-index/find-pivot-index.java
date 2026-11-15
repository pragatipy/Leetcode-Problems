class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            
            if(sum1==sum-sum1-nums[j]){
                return j;
            }
            sum1+=nums[j];

        }
        return -1;
    }
}