package Day2_for_loop_mastery;

public class Program_3_Print_Even_Numbers {
public static void main(String[] args) {
	
	// Logic 
	// Even number means : num % 2
    
	for(int i = 1; i<= 10; i++) {
		
		if(i % 2 == 0) {
			
			System.out.println(i);
		}
	}
}
}
      /*output
       * 2
       * 4
       * 6
       * 8
       * 10
       */