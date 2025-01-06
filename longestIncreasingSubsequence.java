import java.util.*;
public class LongIncreasingSubsequence {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        String str = "abcde";
        generateSubsequences(str, str.length(), "", li);
        System.out.println("Subsequences: " + li);   
        int ans = 0;
        for (String curr : li) {
            if (isIncreasing(curr)) {
                ans = Math.max(ans, curr.length());
            }
        }
        
        System.out.println("Length of the longest increasing subsequence: " + ans);
    }
    // Method to check if a string is strictly increasing
    public static boolean isIncreasing(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) <= str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
    // Method to generate all subsequences
    public static void generateSubsequences(String str, int n, String temp, ArrayList<String> li) {
        if (n == 0) {
            li.add(temp);
            return;
        }
        char ch = str.charAt(n - 1);
        // Not picking the current element
        generateSubsequences(str, n - 1, temp, li);
        // Picking the current element
        generateSubsequences(str, n - 1, ch + temp, li);
    }
}
