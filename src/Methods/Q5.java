//Non-Void Return Type

package Methods;

public class Q5 {
    static int Add(int a, int b){
        int Sum = a+b;
        return Sum;
    }
    static void main(){
        int SUM = Add(10,15);
        System.out.println("Sum = " + SUM);
    }
}
