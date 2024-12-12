class Node {
    int data; 
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head=null;
    public void add(int data) {
        Node new_node= new Node(data);
        if(head==null)
        {
              head= new_node;
              return;
        }
        else
        {
            Node current= head;
          while(current.next!=null)
          {   
            current= current.next;
          }
          current.next= new_node;
        }
    }
    public void display() {
        if(head==null)
        {
            System.out.print("list is empty");
            return;
        }
        Node current= head;
        while(current!=null)
        {
        System.out.println(current.data);
        current=current.next;
        }
    }
    // Method to remove a node with a specific value
    public void remove(int value) {
        if (head==null){
            System.out.println("List is empty");
            return;
            
        }
        else{
            Node cuurenNode=head;
            while (cuurenNode.next!=null && cuurenNode.next.data!=value) {
               cuurenNode=cuurenNode.next;   
            }
            cuurenNode.next=cuurenNode.next.next;
        }
    }
    public void reverse() {
        if (head==null) {
            System.out.println("List is Empty");
            return;       
        }
        Node prev = null;
        Node nxt=null;
        Node curr=head;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head=prev;
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Total Data Inserted");
        list.display();
        System.out.println("After Data Removed");
        list.remove(20);
        list.display();
        System.out.println("Total Data Reversed");
        list.reverse();
        list.display();

    }
}
