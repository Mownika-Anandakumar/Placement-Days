import java.util.*;
public class leapyear_not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "Leap year" : "Not a leap year";
        System.out.println(result);

	}
}
