import java.util.*;
import java.lang.*;
import java.io.*;
class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();  // Length of the permutation
            // Output the reversed sequence
            for (int i = N; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
