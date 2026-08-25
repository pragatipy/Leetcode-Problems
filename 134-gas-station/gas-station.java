class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentTank = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentTank += gas[i] - cost[i];

            // If fuel runs out, reset the starting station to the next station
            if (currentTank < 0) {
                startIndex = i + 1;
                currentTank = 0;
            }
        }

        // If overall gas is less than overall cost, a full circuit is impossible
        return totalGas >= totalCost ? startIndex : -1;
    }
}