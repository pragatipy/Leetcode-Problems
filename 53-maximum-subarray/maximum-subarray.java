class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            max=Math.max(max,cur);
            if(cur<0){
                cur=0;
            }
        }
        return max;
    }
}