package Day3_while_loop_mastery;

public class Program_2_Count_Digits {
public static void main(String[] args) {
	
	// Logic : Keep dividing number until it become 0
	
	int num = 1234;
	int count = 0;
	
	while (num > 0) {
		
		num = num / 10;
		count ++ ;
		
	}
	System.out.println("Digit = "+ count);
  }
}
/*TRACE:
1234 → 123 → 12 → 1 → 0
Count = 4
 * 
*/
