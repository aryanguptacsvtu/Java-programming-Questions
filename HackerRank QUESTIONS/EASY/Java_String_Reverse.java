import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int start = 0;
        int end = A.length() - 1;
        boolean isPalindrome = true;

        while (start < end) 
        {
            if (A.charAt(start) != A.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}

/* "Java String Reverse":-

"Task" :- Given a string A, print Yes if it is a palindrome, print No otherwise.

"Sample Input":-
madam

"Sample Output":-
Yes */