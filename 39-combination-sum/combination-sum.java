import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int remain, int start) {
        // Base case: target sum reached
        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip invalid branch if element exceeds remaining target sum
            if (candidates[i] > remain) {
                continue;
            }

            current.add(candidates[i]);
            // Recurse with index `i` (allowing same element to be chosen multiple times)
            backtrack(result, current, candidates, remain - candidates[i], i);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}