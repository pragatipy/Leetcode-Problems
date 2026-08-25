import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums) {
        // Base case: full permutation formed
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip already chosen elements
            if (current.contains(nums[i])) {
                continue;
            }
            current.add(nums[i]);                  // Choose
            backtrack(result, current, nums);     // Recurse
            current.remove(current.size() - 1);    // Un-choose (Backtrack)
        }
    }
}