import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {
    public static int[] NextGreaterElements(int[] nums) {
    int n=nums.length;
    //fill answers in empty arr 
    int ans[]=new int[n];
    Stack<Integer> st=new Stack<>();
    for(int i=n-1;i>=0;i--){
while(!st.isEmpty() && st.peek()<=nums[i]){
    st.pop();
}

ans[i]=st.isEmpty()?-1:st.peek();
st.push(nums[i]);
    }
    return ans;
}
    public static void main(String[] args) {
        int[] nums= {4, 5, 2, 10, 8};
        int[] result = NextGreaterElements(nums);
        System.out.println(Arrays.toString(result));
    }
}
