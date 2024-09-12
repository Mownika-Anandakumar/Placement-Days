import java.util.Scanner;
class DigitConversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Binary number: ");
        int binary = scanner.nextInt(); 
        int decimalValue = BinarytoDecimal(binary);
        System.out.println("Binary value: " + binary + " = Decimal: " + decimalValue);
        System.out.println("Decimal value: " + decimalValue);
        scanner.close();
    }
    public static int BinarytoDecimal(int a) {
        int sum = 0;
        int p = 1;
        while (a > 0) {
            int d = a % 10;// Extract last digit (binary digit)
            sum = sum + d * p;// Convert binary digit to decimal and add to sum
            p = p * 2; // Move to the next power of 2 
            a = a / 10;  // Remove the processed binary digit
        }
        return sum;
    }
}
