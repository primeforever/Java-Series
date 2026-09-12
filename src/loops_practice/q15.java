//print the sum of all the integers from 1 to 100

package loops_practice;

public class q15 {
    static void main() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);

    }
}
