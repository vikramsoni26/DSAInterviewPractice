package Day_1_If_Else_Mastery;

import java.util.Scanner;

public class EvenOdd {
  
	 // Logic ask yourself : can this number divided by 2 completlely?
	 // if yes --> Even
	 // if no --> Odd
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}
	
	// trace n = 8
	// 8 % 2 = 0
    // Condition: 0 == 0 TRUE
	// output = Even number
	
	
}
