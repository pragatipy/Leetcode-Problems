class pair {
    int sv;
    int ev;
    
    pair(int sv, int ev) {
        this.sv = sv;
        this.ev = ev;
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        
        // edge case
        if(intervals.length <= 1) return intervals;
        
        
        Arrays.sort(intervals, (x, y) -> x[0]-y[0]);
        ArrayList<pair> ans = new ArrayList<>();
        
        int sv = intervals[0][0];
        int ev = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++) {
            if(ev >= intervals[i][0]) {
                ev = Math.max(intervals[i][1], ev);
            }else {
                ans.add(new pair(sv, ev));
                sv = intervals[i][0];
                ev = intervals[i][1];
            }                
        }
        
        ans.add(new pair(sv, ev));
        
        
        int smallAns[][] = new int[ans.size()][2];
        
        for(int i = 0; i< ans.size(); i++) {
            smallAns[i][0] = ans.get(i).sv;
            smallAns[i][1] = ans.get(i).ev;
        }
        
        
        return smallAns;
        
        
        
        
        
    }
}