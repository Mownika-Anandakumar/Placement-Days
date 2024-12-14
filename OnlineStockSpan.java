import java.util.Stack;
 public class OnlineStockSpan {
    public static int[] calculateSpan(int[] nums) {
    int n=nums.length;
    int[]ans=new int[n];
    Stack<Integer>st=new Stack<>();
    for(int i=0;i<n;i++){
        while(!st.isEmpty()&& nums[st.peek()]<=nums[i]){
            st.pop();
        }
        ans[i]=st.isEmpty()?(i+1):(i-st.peek());
        st.push(i);
    }

return ans;
    }
    public static void main(String[] args) {
        int[] nums = {100,80,60,70,60,75,85};
        int[] result = calculateSpan(nums);

        // Print the spans
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
