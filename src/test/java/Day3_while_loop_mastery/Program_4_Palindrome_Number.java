package Day3_while_loop_mastery;

public class Program_4_Palindrome_Number {
public static void main(String[] args) {
	
	// Example : 121 → 121 (YES) , 123 → 321 (NO)
	// Logic   : Reverse number and compare with original    
	
	int num = 121;
	int orginal = num ;
	int rev = 0;
	
	while (num > 0) {
		
		int digit = num % 10 ; // get last digit
		rev       = rev * 10 + digit;
		num       = num / 10 ; // remove last digit		
	}
	 
	if (orginal == rev) {
		
		System.out.println("Plaindrome number");
	} else {
		System.out.println("not Plaindrome number");
	}
}
}
/*TRACE:
Original = 121
Reverse = 121
 */
