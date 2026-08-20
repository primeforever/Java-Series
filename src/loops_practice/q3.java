//Q3))Write a Java program to print all even numbers between 1 and 50 using a for loop

package loops_practice;

public class q3 {
    static void main(){
        System.out.println("even nums are as follows: ");

        for (int i = 1; i<=50; i++){
            if (i%2 ==0){
                System.out.println(i);
            }

        }
    }
}
