package practice_Question.learn.basic;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10; 
        int count = 0;
        
        System.out.println("First " + n + " prime numbers:");

        for (int number = 2; count < n; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }
}
