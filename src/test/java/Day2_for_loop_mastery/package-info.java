package Day2_for_loop_mastery;

// What is for loop 
// A for loop is used when we know in advance how many times we want to execute a block of code.
// syntax
// for(initialization; condition; increment/decrement) {
// code
//}
// Example : for (int i = 1; i <= 10; i++) {
// sop(i);
// }
// How does it work internally?
// Step 1: Initialization
// int i = 1;
// Runs only once.
// Step 2: Condition Check
// i <= 5 If TRUE → Enter loop. If FALSE → Stop loop.
// Step 3: Execute Code
// System.out.println(i);
// Step 4: Increment
// i++;
// Means:
// i = i + 1;
// Step 5: Repeat
// Go back to condition.
// Trace it
// for(int i = 1; i <= 5; i++) {
// System.out.println(i);
// }
// i	Condition	Output
// 1	1<=5 TRUE	1
// 2	2<=5 TRUE	2
// 3	3<=5 TRUE	3
// 4	4<=5 TRUE	4
// 5	5<=5 TRUE	5
// 6	6<=5 FALSE	Stop

// Output:
// 1
// 2
// 3
// 4
// 5
/*
 Interview Questions
 What is a For Loop?
 A for loop is used when the number of iterations is known beforehand.
 What does i++ mean?
 i = i + 1;
 What does i-- mean?
 i = i - 1;
 What happens if condition becomes false?
 The loop terminates.
 IMPORTANT
 Bro...+
 When writing a loop, ask only these 3 questions:
 1. Where do I start?
 2. Where do I stop?
 3. How do I move?
 Example:
 Print 1–10
 Start → 1
 Stop → 10
 Move → +1
If you answer these 3 questions, 80% of loops become easy.
 */
