//Print all prime numbers from 1 to 100

package loops_practice;

public class q14 {
    static void main() {
        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check for factors from 2 up to the square root of num
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If no factors were found, the number is prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
