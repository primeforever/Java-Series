//Methods With Same Name [METHOD OVERLOADING]

package Methods;

public class Q7 {
    static int add(int a, int b){
        int Sum = a + b;
        return Sum;
    }
    static int add(int a, int b, int c){
        int total =a+b+c;
        return total;
    }
    static void main(){
        int Ans1 = add(5,10);
        int Ans2 = add(5,10,10);
        System.out.println("Ans1 = " + Ans1);
        System.out.println("Ans2 = " + Ans2);
    }
}
