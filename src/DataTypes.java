import java.sql.SQLOutput;

public class DataTypes {
    static void main() {
        //Type casting
        long value1 = 123456789;
        int value2 =(int)value1;
        System.out.println(value2);

     byte num1 = 127;
      long Newnum = num1;
        System.out.println(Newnum);
     System.out.println(num1);

     short num2 = 500;
     System.out.println(num2);

     int num3 = 500000;
     System.out.println(num3);

     long num4 = 654654654;
     System.out.println(num4);

     //floating DTs
        float num5 = 23.456f;
        System.out.println(num5);

        double num6 = 5.65798765;
        System.out.println(num6);

        //other - char, bool
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("my First character is:" +(char)(firstCharacter + 2));
        
    }
}