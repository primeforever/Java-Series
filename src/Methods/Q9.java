//IS Even

package Methods;

public class Q9 {
    static boolean Iseven(int num){

        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    static void main(){
        boolean result = Iseven(10);

        System.out.println(result);
    }
}
