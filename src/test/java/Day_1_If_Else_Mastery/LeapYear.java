package Day_1_If_Else_Mastery;

public class LeapYear {
public static void main(String[] args) {
	
	  // Leap Year
	  // Logic : A year is leep year if 
	  // Divisible by 400 OR Divisible by 4 but not divisible by 100
	
	  int year  = 1996;
	  
	  if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
		  System.out.println(year +  " This Year is leep year");
		
	} else {
		System.out.println(year + " This Year is not leep");
	}
}
}
