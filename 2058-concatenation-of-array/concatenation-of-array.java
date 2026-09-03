class Solution {
    public int[] getConcatenation(int[] nums) {
        int i=0;
        int [] arr=new int[2*nums.length];
        for(i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }
}