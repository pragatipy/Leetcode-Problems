class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the maximum reach, we can't proceed
            if (i > maxReachable) {
                return false;
            }
            
            // Update the maximum index we can reach from here
            maxReachable = Math.max(maxReachable, i + nums[i]);
            
            // If we can already reach or pass the last index, return true early
            if (maxReachable >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }
}