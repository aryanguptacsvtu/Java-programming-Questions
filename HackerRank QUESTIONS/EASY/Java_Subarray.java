import java.util.*;

public class Java_Subarray {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += A[j];

                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/* "Java Subarray":-

"Input Format":-
The first line contains a single integer,n, denoting the size of the array.
The second line contains n space-separated integers describing each respective element,a[i], in array A.

"Output Format":-
Print the number of subarrays of A having negative sums.

"Sample Input":-
5
1 -2 4 -5 1

"Sample Output":-
9
 */