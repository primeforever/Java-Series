package Methods;

public class Q13 {
    static int factorial(int num){
        int fact = 1;

        for(int i =1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }

    static void main() {
        System.out.println(factorial(5));
    }
}