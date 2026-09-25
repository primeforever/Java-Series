//ATM Withdrawal

package Conditionals;

import java.util.Scanner;
public class Q16 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdrawal = sc.nextInt();

        if (withdrawal <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else if (withdrawal % 100 != 0) {
            System.out.println("Amount must be a multiple of ₹100");
        }
        else if (withdrawal > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - withdrawal;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}