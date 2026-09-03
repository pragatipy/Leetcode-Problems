class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for(int customer=0;customer<accounts.length;customer++){
            int current_val=0;
            for(int bank=0;bank<accounts[customer].length;bank++){
                current_val += accounts[customer][bank];
                
            }
            max=Math.max(current_val,max);
        }
        
        return max;
    }
}