package Day3_while_loop_mastery;

import java.util.Scanner;

public class Program_1_Reverse_number {
public static void main(String[] args) {
	

	// Logic 
	// Step 1 : take last digit --> num % 10
	// Step 2 : add to Reverse --> rev = rev * 10  + Digit
	// Step 3 : Remove digit --> num / 10

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int rev = 0;
	
	while (num > 0) {
		
		int digit = num % 10;
		rev       = rev * 10 + digit;
		num       = num / 10;
		
	}
	 System.out.println("Reverse = " + rev);
	 sc.close(); 
   }	
}

/*TRACE (VERY IMPORTANT)
Input:
1234
Step	num	  digit	 rev
1	    1234	4	 4
2	    123	    3	 43
3	    12	    2	 432
4	    1	    1	 4321
Output:
4321
*/