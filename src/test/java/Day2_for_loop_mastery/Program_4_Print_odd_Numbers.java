package Day2_for_loop_mastery;

public class Program_4_Print_odd_Numbers {
public static void main(String[] args) {
	
	// Logic num % 2 == 1 num % 2 !=0
	
	for(int i = 1; i<= 10; i++) {
		
		if(i % 2 == 1) {
			
			System.out.println(i);
		}
	}
}
}
   /* output
    * 1
    * 3
    * 5
    * 7
    * 9
    */
    