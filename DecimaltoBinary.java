import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Decimal Value: ");
        int decimalvalue = scanner.nextInt(); 
        System.out.print("Binary Value: ");
        DecimaltoBinary(decimalvalue);
        scanner.close();
    }
    public static void DecimaltoBinary(int a) {
        String s="";//print in reverse order
       while (a > 0) {
       s=s+a%2;
       a=a/2; //to move next previous digit
       
       }
    for(int i=s.length()-1;i>=0;i--)
    {
        System.out.print(s.charAt(i));
    }
  }
}
