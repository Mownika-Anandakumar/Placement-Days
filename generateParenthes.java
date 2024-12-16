import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Solution {
    List<String> results=new ArrayList<>();
    public List<String> generateParenthesis(int n) { 
       backtrack("",0,0,n);
       return results;
    }
    private void backtrack(String current,int open,int close,int max){
        if(current.length() == max*2){
            results.add(current);
            return;
        }
        if(open < max){
            backtrack(current+"(",open + 1,close,max);
        }
        if(close < open){
            backtrack(current +")",open,close + 1,max);
        }
    }
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        Solution solution = new Solution();
        List<String> combinations = solution.generateParenthesis(n);
        System.out.println(combinations);
    }
}
