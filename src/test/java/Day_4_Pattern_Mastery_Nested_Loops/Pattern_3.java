package Day_4_Pattern_Mastery_Nested_Loops;

public class Pattern_3 {

	public static void main(String[] args) {
	//	1
	//	12
	//	123
	//	1234
	//	12345
	//	Observe
	//	Row 1 → 1
	//	Row 2 → 12
	//	Row 3 → 123
	//	Row 4 → 1234
	//	Row 5 → 12345
	//	Again: Numbers = Row Number
		// Logic
		// Outer Loop = Rows
		// for(int i=1; i<=5; i++)
		// Inner Loop = Stars
		// for(int j=1; j<=i; j++)	print hume j ko karna hai
		
		for (int i = 1; i <= 5; i++) {
			
		for(int j = 1; j<= i; j++) {
			
			System.out.print(j);
			
		}
		System.out.println();
		}		
	}
}
