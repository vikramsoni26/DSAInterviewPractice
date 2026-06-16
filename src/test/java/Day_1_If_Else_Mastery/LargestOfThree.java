package Day_1_If_Else_Mastery;

public class LargestOfThree {
  public static void main(String[] args) {
	
	  // Largest of 3 number
	  // Logic: suppose a= 10; b = 50; c= 30 ask is a greater then b and c
	  // answere is no then ask is b greater then a and c if yes therefore b is largest
	  
	  int a = 10;
	  int b = 50;
	  int c = 30;
	  
	  if (a >= b && a >= c) {
		  System.out.println(a + "is Largest");
		
	} else if (b >= a && b >= c) {
		 System.out.println(b + "is Largest");
		
	} else {
		System.out.println(c + "Is largest");
	}
		
	}
}

