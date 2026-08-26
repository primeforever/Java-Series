//IF_ELSE_IF User Input

package Conditionals;
import java.util.*;
public class q3 {
    static void main() {
        Scanner Day = new Scanner(System.in);
        System.out.println("enter a Number Between 1-7 : ");
        int n = Day.nextInt();
        if (n == 1) {
            System.out.println("Monday");
        }
        else if(n == 2){
            System.out.println("Tuesday");
        }
        else if(n == 3){
            System.out.println("Wednesday");
        }
        else if(n == 4){
            System.out.println("Thursday");
        }
        else if(n == 5){
            System.out.println("Friday");
        }
        else if(n == 6){
            System.out.println("Saturday");
        }
        else if(n == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Please Enter a Valid value");
        }

    }
}