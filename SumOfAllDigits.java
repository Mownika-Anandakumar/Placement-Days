import java.util.Scanner;
class SumOfAllDigits{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum of all digits: " + sum);
    }
}
