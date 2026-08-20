//Q4))Write a Java program to calculate the sum of numbers from 1 to N (both inclusive).

package loops_practice;
import java.util.*;
public class q4 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("enter the number N : ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
        sum+=i;
            //sum = sum + i;
        }
        System.out.println("the final sum is : " + sum);


    }
}
