import java.util.*;
public class Armstrong{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n =cin.nextInt();
		int temp =n;
		int cnt = 0;
		while(n>0){
		    n = n/10;
		    cnt++;
		}
		 n =temp;
		int sum=0;
		while(n>0){
		    int rem = n%10;
		    sum = sum + (int)Math.pow(rem , cnt);
		    n = n /10;
		}
		if(sum == temp ){
		    System.out.println("It is a armstrong number");
		}else{}
		    System.out.println("It is not a armstrong number");
		}
	}
}
 
