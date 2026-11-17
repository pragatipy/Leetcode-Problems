import java.util.*;

class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        
        // Precompute proper divisors for all possible lengths 1..n
        List<Integer>[] divisors = new ArrayList[n + 1];
        for (int len = 1; len <= n; len++) {
            divisors[len] = new ArrayList<>();
            for (int d = 1; d < len; d++) {
                if (len % d == 0) {
                    divisors[len].add(d);
                }
            }
        }
        
        // cost[i][j] = min changes to make s[i..j] a semi-palindrome
        int[][] cost = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                cost[i][j] = getMinChanges(s, i, j, divisors[j - i + 1]);
            }
        }
        
        // dp[i][p] = min changes to partition prefix of length i into p semi-palindromes
        int INF = 1_000_000;
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }
        dp[0][0] = 0;
        
        for (int parts = 1; parts <= k; parts++) {
            // Each part needs at least length 2, so i >= parts * 2
            for (int i = parts * 2; i <= n; i++) {
                for (int p = (parts - 1) * 2; p <= i - 2; p++) {
                    if (dp[p][parts - 1] != INF) {
                        dp[i][parts] = Math.min(dp[i][parts], dp[p][parts - 1] + cost[p][i - 1]);
                    }
                }
            }
        }
        
        return dp[n][k];
    }
    
    private int getMinChanges(String s, int start, int end, List<Integer> divs) {
        int len = end - start + 1;
        int minChanges = Integer.MAX_VALUE;
        
        for (int d : divs) {
            int changes = 0;
            // Check each of the d interleaved groups
            for (int rem = 0; rem < d; rem++) {
                int left = start + rem;
                int right = end - (d - 1 - rem);
                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        changes++;
                    }
                    left += d;
                    right -= d;
                }
            }
            minChanges = Math.min(minChanges, changes);
        }
        
        return minChanges;
    }
}