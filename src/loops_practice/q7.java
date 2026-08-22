//Q8))Write a Java program to count how many numbers from 1 to 100 (both inclusive) are divisible by 3

package loops_practice;

public class q7 {
    static void main() {
        int count =0;
        for(int i=1;i<=100; i++){
            if (i%3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
