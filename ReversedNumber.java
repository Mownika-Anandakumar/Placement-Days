import java.util.Scanner;
class ReversedNumber{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();
        int sum = 0;
        System.out.println("Reversed Number:");
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            System.out.println(rem);
        }
    }
}
