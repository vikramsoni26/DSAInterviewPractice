package Day2_for_loop_mastery;

public class Program_5_Sum_of_First_N_Numbers {
public static void main(String[] args) {
	
	// Logic need a variable sum = 0
	// add sum + i
	
	int sum = 0;
	
	for(int i = 1; i <= 5; i++) {
		
		sum = sum + i;
	}
	System.out.println(sum);
}
}
    // output is 15.