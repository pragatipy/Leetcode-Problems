import java.util.Arrays;
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int operation=0;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==k){
                l++;
                r--;
                operation++;
            }
            else if(sum>k){
                r--;
            }
            else{l++;}

        }
        return operation;
    }
}