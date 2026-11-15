class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int len=0;
        int zero=0;
        for (int j=0;j<nums.length;j++){
            if(nums[j]==0){
                zero++;
            }
            while(zero>1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            
            len=Math.max(len,j-left);
        }
        return len;
    }
}