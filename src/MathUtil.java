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

    /* code was written with recursion */
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    /*we need to find all divisors of a number (we are doing this in a loop) and then sum the divisors. if sum = n then it's a perfect number*/
    public boolean idPerfectNumber(int n) {
        int sum = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    /* if there are tens or hundreds in a number we divide it by 10 with a remainder to get the
    last number we add it to the sum and then divide the number by 20 to reduce it*/
    public int sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**/
    public int reverseNumber(int n) {
        int reverse = 0;
        while(n!=0){
            int last = n%10;
            reverse = reverse * 10 + last;
            n /= 10;
        }
        return reverse;
    }

    /**/
    public boolean isArmstrongNumber(int n) {
        int sum = 0;
        int temp = n;
        int power = String.valueOf(n).length();

        while(temp > 0) {
            int num = temp % 10;
            sum += Math.pow(num, power);
            temp = temp / 10;
        }
        return sum == n;
    }

    public int nextPrime(int n) {
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }
}