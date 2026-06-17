package Day_4_Pattern_Mastery_Nested_Loops;

public class Pattern1 {
public static void main(String[] args) {
	

	 // *              
//      **
//	    ***
//	    ****
//	    *****
	     
	    for(int i = 1; i <= 5; i++) {
	    	
	    	for(int j = 1; j <= i; j++) {
	    		
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println();
	    }
}	 
}
// Step 1: Observe
// Rows:
// Row 1 → 1 star
// Row 2 → 2 stars
// Row 3 → 3 stars
// Row 4 → 4 stars
// Row 5 → 5 stars
// Notice?
// Stars = Row Number
// Logic
// Outer Loop = Rows
// for(int i=1; i<=5; i++)
// Inner Loop = Stars
// for(int j=1; j<=i; j++)
