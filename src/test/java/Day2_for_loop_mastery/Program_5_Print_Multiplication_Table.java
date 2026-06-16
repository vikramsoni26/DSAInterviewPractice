package Day2_for_loop_mastery;

public class Program_5_Print_Multiplication_Table {
public static void main(String[] args) {
	
	// logic num = 2;
	// 2*1 = 2, 2*2 = 4 etc
	
	int num = 2;
	
	for(int i = 1; i<= 10; i++) {
		
		System.out.println(num+ " x " + i + " = " +(num * i));
	}
}
}
     /* output
      2 x 1 = 2
      2 x 2 = 4
      2 x 3 = 6
      2 x 4 = 8
      2 x 5 = 10
      2 x 6 = 12
      2 x 7 = 14
      2 x 8 = 16
      2 x 9 = 18
      2 x 10 = 20

      */
