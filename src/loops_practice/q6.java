//Q7)Write a Java program to calculate the factorial of a given number.

package loops_practice;
import java.util.*;
public class q6 {
    static void main() {
        int fact = 1;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
