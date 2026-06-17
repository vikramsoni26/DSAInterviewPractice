package Day_4_Pattern_Mastery_Nested_Loops;

import java.util.Iterator;

public class Pattern_2 {

	public static void main(String[] args) {
		
 //  		*****
 //		    ****
 //		    ***
 //		    **
 //		    *
            
	//	Observe
	//	Row 1 → 5 stars
	//	Row 2 → 4 stars
	//	Row 3 → 3 stars
	//	Row 4 → 2 stars
	//	Row 5 → 1 star
	//	Notice? Stars decreasing
	//	Logic
	//	Outer Loop:for(int i=5; i>=1; i--)	
	//	Inner Loop:for(int j=1; j<=i; j++)
		
		for(int i = 5; i>=1; i--) {
			
			for(int j = 1; j<= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
