class Solution {
    public int maxVowels(String s, int k) {
        String v="aioueAIOEU";
        int vcount=0;
        
        for(int i=0;i<k;i++){
            if(v.indexOf(s.charAt(i))!=-1){
                vcount++;
            }
        }
        int max=vcount;
        for(int i=k;i<s.length();i++){
            if(v.indexOf(s.charAt(i))!=-1){
                vcount++;
            }
            if (v.indexOf(s.charAt(i - k)) != -1) {
                vcount--;
            }

            max = Math.max(max, vcount);
        }
        return max;
    }
}