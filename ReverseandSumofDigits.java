import java.util.Scanner;
public class ReverseandSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int sum = 0;
        while(n > 0)
        {
            int rem = n % 10;
            sum += rem;
            res = res * 10 + rem;
            n/=10;
        }
        System.out.println(res);
        System.out.println(sum);
    }
}
