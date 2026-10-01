//Input For Index

package Array;

import java.util.*;
public class Q5 {
    static void main() {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        int n = arr.length;

        //input
        for(int i = 0; i<= n-1; i++){
            System.out.println("Provide Input For Index:" + i);
            arr[i] = sc.nextInt();
        }

        //print
        for(int val: arr){
            System.out.println(val);
        }
    }
}
