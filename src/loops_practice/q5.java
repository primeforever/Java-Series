//Q6))Write a Java program to print the multiplication table of a given number from 1 to 10.
package loops_practice;
import java.util.*;
public class q5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
