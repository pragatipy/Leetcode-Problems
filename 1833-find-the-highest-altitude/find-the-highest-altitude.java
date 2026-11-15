class Solution {
    public int largestAltitude(int[] gain) {
        int maxheight=0;
        int currentheight=0;
        for(int i=0;i<gain.length;i++){
            currentheight+=gain[i];
            maxheight=Math.max(maxheight,currentheight);
        }
        return maxheight;
    }
}