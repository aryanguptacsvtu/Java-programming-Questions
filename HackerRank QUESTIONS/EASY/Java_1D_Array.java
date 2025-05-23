import java.util.*;

public class Java_1D_Array {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] a = new int[n]; 
        
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }      
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

/* "Java 1D Array":-

"Input Format":-
The first line contains a single integer,n, denoting the size of the array.
Each line i of the n subsequent lines contains a single integer denoting the value of element a[i].

"Output Format":-
You are not responsible for printing any output to stdout. Locked code in the editor loops through array a and prints each sequential element on a new line.

"Sample Input":-
5
10
20
30
40
50

"Sample Output":-
10
20
30
40
50
 */