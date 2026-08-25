import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int start) {
        // Add a copy of the current combination to the result
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);                     // Include element
            backtrack(result, current, nums, i + 1);  // Recurse for next elements
            current.remove(current.size() - 1);       // Backtrack
        }
    }
}