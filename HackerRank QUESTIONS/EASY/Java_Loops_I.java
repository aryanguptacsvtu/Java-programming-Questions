import java.io.*;

public class Java_Loops_I {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
        bufferedReader.close();
    }
}

/* "Java Loops I":-

"Input Format":-
A single integer,N .

"Output Format":-
Print 10 lines of output: each line i (where 1 <=i<= 10) contains the result of N x i = result in the form: N x i = result.

"Sample Input":-
2

"Sample Output":-
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