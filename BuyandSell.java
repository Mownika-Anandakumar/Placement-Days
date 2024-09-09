import java.util.*;
class Acc{
    public int maxProfit(int[] prices) {
        int total=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1])
            {
                total+=prices[i+1]-prices[i];
            }
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Acc Obj = new Acc();
        int result = Obj.maxProfit(arr);
        System.out.println(result);
    }
}
