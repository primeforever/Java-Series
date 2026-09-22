//Getting Maximum Value

package Methods;

public class Q10 {

    static int GetMaximum(int a, int b){

        if (a>b){
            return a;
        }

        else {
            return b;
        }
    }
    static void main(){

        int Result = GetMaximum(12,45);

        System.out.println(Result);
    }
}
