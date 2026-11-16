import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>,Integer> rowcount=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<grid.length;i++){
            List<Integer> row=new ArrayList<>(n);
            for(int j=0;j<grid.length;j++){
                row.add(grid[i][j]);
            }
            rowcount.put(row,rowcount.getOrDefault(row,0)+1);
        }
        int pair=0;
        for(int j=0;j<grid.length;j++){
            List<Integer> col=new ArrayList<>(n);
            for(int i=0;i<grid.length;i++){
                col.add(grid[i][j]);
            }
            pair+=rowcount.getOrDefault(col,0);
        }
        return pair;
    }
}