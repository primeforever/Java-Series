//Simple Use Of Method Printing 2ka Table

package Methods;

public class q1 {
    static void Print2KaTable(){
        for(int i=1; i<=10; i++){
            int ans = 2*i;
            System.out.println("->" + ans);
        }
    }

    static void main() {
        System.out.println("hi");
        Print2KaTable();
        System.out.println("Bye");
    }
}