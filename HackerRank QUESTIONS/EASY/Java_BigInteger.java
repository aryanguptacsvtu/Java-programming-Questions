import java.math.*;
import java.util.*;

public class Java_BigInteger {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

/* "Java Big Integer":-

"Input Format":-
There will be two lines containing two numbers, a and b.

"Output Format":-
Output two lines. The first line should contain a+b, and the second line should contain axb. Don't print any leading zeros.

"Sample Input":-
1234
20

"Sample Output":-
1254
24680
 */