class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> FreqOcc=new HashMap<>();
        for(int num:arr){
            FreqOcc.put(num,FreqOcc.getOrDefault(num,0)+1);
        }
        Set<Integer> Unique=new HashSet<>();
        for(int num:FreqOcc.values()){
            if(!Unique.add(num)){
                return false;
            }
        }
        return true;
    }
}