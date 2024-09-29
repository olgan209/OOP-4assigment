public class Main {
    public static void main(String[] args) {
        System.out.println("Prime or not");
        MathUtil.isPrime(5);
        if (MathUtil.isPrime(5)) {
            System.out.println("Prime number");
        } else { System.out.println("Not Prime number");}
        MathUtil.isPrime(9);
        if (MathUtil.isPrime(9)) {
            System.out.println("Prime number");
        } else { System.out.println("Not Prime number");}
        MathUtil.isPrime(-9);
        if (MathUtil.isPrime(-9)) {
            System.out.println("Prime number");
        } else { System.out.println("Not Prime number");}

        System.out.println();
        System.out.println("GCD");
        System.out.println(MathUtil.gcd(9,36));
        System.out.println(MathUtil.gcd(8,44));
        System.out.println(MathUtil.gcd(4,16));

        System.out.println();
        System.out.println("LCM");
        System.out.println(MathUtil.lcm(9,6));
        System.out.println(MathUtil.lcm(3,9));
        System.out.println(MathUtil.lcm(2,60));

        System.out.println();
        System.out.println("Fibonacci");
        System.out.println(MathUtil.fibonacci(6));
        System.out.println(MathUtil.fibonacci(5));
        System.out.println(MathUtil.fibonacci(0));

        System.out.println();
        System.out.println("Factorial");
        System.out.println(MathUtil.factorial(5));
        System.out.println(MathUtil.factorial(8));
        System.out.println(MathUtil.factorial(2));
    }

}



//isPerfectNumber(int n)
//
//Description: Determines if the given number n is a perfect number (a number equal to the sum of its divisors, excluding itself).
//Returns: true if the number is perfect, otherwise false.
//sumOfDigits(int n)
//
//Description: Computes the sum of the digits of the given number n.
//Returns: The sum of the digits of n.
//reverseNumber(int n)
//
//Description: Reverses the digits of a number n.
//Returns: The number formed by reversing the digits of n.
//isArmstrongNumber(int n)
//
//Description: Checks if a number is an Armstrong number (a number that is equal to the sum of its own digits each raised to the power of the number of digits).
//Returns: true if n is an Armstrong number, otherwise false.
//nextPrime(int n)
//
//Description: Finds the smallest prime number greater than n.
//Returns: The next prime number after n.