public class MathUtil {
    public static boolean isPrime(int n) { /* In method isPrime we will use % to identify if our number is prime*/
        if(n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int gcd(int n, int c) {  /* in this method we are using Euclidean algorithm (if a % b == 0 then b = gcd) also we are usi recursion (when the function calls itself) */
        return n % c == 0 ? c : gcd(c, n % c);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

/* I don't know I wrote this code, I just wrote the sequence of fibonacci : 1 1 2 3 5 8 13 ... and understood the logic*/
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int first = 1;
        int start = 1;
        for (int i = 2; i <= n; i++) {
            int temp = first;
            first = start + temp;
            start = temp;
        }
        return first;
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
