class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=0;
        int m=0;
        while(m<s.length() && n<t.length()){
            if(s.charAt(m)==t.charAt(n)){
                m++;
            }
            n++;
        }
        return m==s.length()?true:false;
        
    }
}