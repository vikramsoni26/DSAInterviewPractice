package Day_1_If_Else_Mastery;

public class Divisible {

	  // divisble by 3 and 5
	  // logic : num % 3 == 0 and num % 5 == 0
	  // let's take num = 15;
	   public static void main(String[] args) {
		
	
	     int num = 15;
	     
	     if(num % 3 == 0 && num % 5 == 0) {
	    	 System.out.println("Divisible by 3 and 5");
	     } else {
	    	 System.out.println("Not Divisible");
	     }
	
}
}
