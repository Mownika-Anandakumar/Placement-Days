import java.util.Stack;
public class validParenthesis {
    public boolean isValid(String s) { 
        Stack<Character>st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                char ch1=st.pop();
               if((ch == ')' && ch1 != '(') || (ch == '}' && ch1 != '{') || (ch == ']' && ch1 != '[')) {
                    return false;
                }
            }
        }
        return st.size() ==0;
    }
public static void main(String[] args) {
    balancedString check = new balancedString();
    String input1 = "([{}])";
    String input2 = "({[})";
    System.out.println(check.isValid(input1)); 
    System.out.println(check.isValid(input2));
}
}
