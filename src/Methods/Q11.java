//calculate Percentage

package Methods;

public class Q11 {
    static float percentage(int obtained, int total){

        float Percentage = ((float) obtained/total) * 100;
        return Percentage;
    }

    public static void main(){

        float Result = percentage(79, 100);
        System.out.println(Result);
    }
}
