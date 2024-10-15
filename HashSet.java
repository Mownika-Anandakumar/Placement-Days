import java.util.*;
class Solution {
     private int arr[] = new int[1000000];
    public void add(int key) {
        arr[key]=1;
    }
    public void remove(int key) {
        arr[key]=0;
   }
    public boolean contains(int key) {
        //Complete the function
        if(arr[key] == 1){
            return true;
        }else{
            return false;
        }
        }
} 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();
        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();
            if (choice == 1) {
                Obj.add(key);
            } else if (choice == 2) {
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}
