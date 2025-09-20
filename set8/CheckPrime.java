public class CheckPrime {

    // Correct method to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Main method to test
    public static void main(String[] args) {
        int n = 10;

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }
    }
}

