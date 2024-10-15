import java.util.*;
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }    
        Solution A = new Solution();
        A.checkLinkedListPalindrome(llist.head);
    }
}
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}
class Solution
{
    static void checkLinkedListPalindrome(Node head)
    {
        //Your code here
        Stack<Integer>stack =new Stack<>();
        Node temp= head;
        while(temp !=null){
            stack.push(temp.data);
            temp=temp=temp.next;
        }
        temp=head;
        boolean isPalindrome = true;
        while(temp!= null){
            int top=stack.pop();
            if(temp.data!=top){
                isPalindrome=false;
                break;
            }
            temp=temp.next;
        }
        if(isPalindrome){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
