class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int bank : customer) {
                currentWealth += bank;
            }
            max = Math.max(max, currentWealth);
        }
        
        return max;
    }
}