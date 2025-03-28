import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
class Main {
    static Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }     
	public static void main (String[] args) throws IOException{
		    Scanner sc = new Scanner(System.in); 
			String s = sc.nextLine();
			Node root = buildTree(s);
			Solution tree = new Solution();
		 tree.preorderTraversal(root);
	}
}
class Solution {
	public static void preorderTraversal(Node root) {
		if(root==null){
		    return;
		}
		System.out.print(root.data+" ");
		 preorderTraversal(root.left);
		preorderTraversal(root.right);
        
	}
}
