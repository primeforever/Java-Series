//Square Of Numbers

package Methods;

import java.util.Scanner;

public class Q3 {

    // Method to calculate square
    static int calculateSquare(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calling the method
        int result = calculateSquare(number);

        System.out.println("Square = " + result);

        sc.close();
    }
}
