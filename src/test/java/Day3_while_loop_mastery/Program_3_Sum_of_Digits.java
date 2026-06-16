package Day3_while_loop_mastery;

public class Program_3_Sum_of_Digits {
public static void main(String[] args) {
	
	// Example 1234 = 1 + 2 + 3 + 4 = 10
	
	int num = 1234;
	int sum = 0;
	
	while (num > 0) {
		
		int digit = num % 10 ; // last digit
		sum       = sum + digit;
		num       = num / 10 ; // remove last digit
	}
	
	    System.out.println("Sum = " + sum);
  }
}
/*TRACE:
     num	digit	sum
    1234	4	     4
    123	    3	     7
    12	    2	     9
    1	    1	     10
*/