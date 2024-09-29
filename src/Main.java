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

        System.out.println();
        System.out.println("Is perfect number");
        MathUtil util = new MathUtil();
        System.out.println(util.idPerfectNumber(6));
        System.out.println(util.idPerfectNumber(90));
        System.out.println(util.idPerfectNumber(2));

        System.out.println();
        System.out.println("Sum of digits");
        MathUtil sum = new MathUtil();
        System.out.println(sum.sumOfDigits(61));
        System.out.println(sum.sumOfDigits(910));
        System.out.println(sum.sumOfDigits(32));

        System.out.println();
        System.out.println("Reverse of digits");
        MathUtil reverse = new MathUtil();
        System.out.println(reverse.reverseNumber(61432));
        System.out.println(reverse.reverseNumber(910));
        System.out.println(reverse.reverseNumber(32));

        System.out.println();
        System.out.println("Is Armstrong Number");
        MathUtil armstrong = new MathUtil();
        System.out.println(armstrong.isArmstrongNumber(61));
        System.out.println(armstrong.isArmstrongNumber(910));
        System.out.println(armstrong.isArmstrongNumber(372));

        System.out.println();
        System.out.println("Is Next Prime Number");
        MathUtil prime = new MathUtil();
        System.out.println(prime.nextPrime(61));
        System.out.println(prime.nextPrime(910));
        System.out.println(prime.nextPrime(372));
    }

}
