class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] result=new int[nums.length];
        int ind=0;
        for(int i=0;i<n;i++){
            result[ind]=nums[i];
            ind++;
            result[ind]=nums[i+n];
            ind++;
        }
        return result;
    }
}