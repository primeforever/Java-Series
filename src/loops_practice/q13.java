//Loops With Continue Statement
package loops_practice;

public class q13 {
    static void main() {

        for(int i=1;i<=10;i++) {
            if(i == 2 || i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}