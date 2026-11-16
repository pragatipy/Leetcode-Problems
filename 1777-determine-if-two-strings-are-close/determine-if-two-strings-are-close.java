class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        Map<Character,Integer> w1=new HashMap<>();
        Map<Character,Integer> w2=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char c1=word1.charAt(i);
            char c2=word2.charAt(i);
            w1.put(c1,w1.getOrDefault(c1,0)+1);
            w2.put(c2,w2.getOrDefault(c2,0)+1);
        }
        if(!w1.keySet().equals(w2.keySet())){
            return false;
        }
        List<Integer> l1=new ArrayList<>(w1.values());
        List<Integer> l2=new ArrayList<>(w2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
}