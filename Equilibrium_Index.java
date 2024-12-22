class Solution {
    static int findEquilibriumIndex(int[] a) {
        int totalSum = 0;
        for (int num : a) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < a.length; i++) {
            int rightSum = totalSum - leftSum - a[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += a[i]; 
        }
        return -1; 
    }
}
