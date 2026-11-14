class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int w=r-l;
            int ht=Math.min(height[l],height[r]);
            int ar=w*ht;
            ans=Math.max(ans,ar);
            if(height[l]>height[r]){
                r--;
            }
            else{l++;}
        }
        return ans;
    }
}