package Day_4_Pattern_Mastery_Nested_Loops;
/*THE BIGGEST MISTAKE
Most people think:
How do I print stars?
Wrong.
Think:
How many rows?
How many columns?
Pattern 1 ⭐⭐⭐⭐⭐
Output:
*
**
***
****
*****
Step 1: Observe
Rows:
Row 1 → 1 star
Row 2 → 2 stars
Row 3 → 3 stars
Row 4 → 4 stars
Row 5 → 5 stars
Notice?
Stars = Row Number
Logic
Outer Loop = Rows
for(int i=1; i<=5; i++)
Inner Loop = Stars
for(int j=1; j<=i; j++)
Code
public class Pattern1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
TRACE
i = 1
j=1
*
i = 2
j=1
j=2

**
i = 3
***
Output:
*
**
***
****
*****
Pattern 2 ⭐⭐⭐⭐⭐
Output:
*****
****
***
**
*
Observe
Row 1 → 5 stars
Row 2 → 4 stars
Row 3 → 3 stars
Row 4 → 2 stars
Row 5 → 1 star
Notice?
Stars decreasing
Logic
Outer Loop:
for(int i=5; i>=1; i--)
Inner Loop:
for(int j=1; j<=i; j++)
Code
public class Pattern2 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
Output:
*****
****
***
**
*
Pattern 3 ⭐⭐⭐⭐⭐
Output:
1
12
123
1234
12345
Observe
Row 1 → 1
Row 2 → 12
Row 3 → 123
Row 4 → 1234
Row 5 → 12345
Again:
Numbers = Row Number
Code
public class Pattern3 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
TRACE
i = 3
Inner Loop:
j=1 → print 1
j=2 → print 2
j=3 → print 3
Output:
123
🎯 GOLDEN RULE FOR PATTERNS
Whenever you see a pattern, ask:
Question 1
How many rows?
Question 2
How many columns in each row?
Question 3
Are columns increasing or decreasing?
Interview Questions
What is Nested Loop?
A loop inside another loop is called a nested loop.
Why use Nested Loops in Patterns?
The outer loop controls rows and the inner loop controls columns or elements printed in each row.
*
*/