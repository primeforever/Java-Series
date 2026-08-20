public class Operators {
    static void main() {
        int value1 = 25;
        int value2 = 15;

        int total = value1 + value2;
        int difference = value1 - value2;
        int projected = value1 * value2;
        int average  = value1 / 7;
        int remainder = value1 % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

//            int value3 = 45;
//            int value4 = 50;
//
//            System.out.println(value3 == value4);
//            System.out.println(value3 != value4);
//            System.out.println(value3 > value4);
//            System.out.println(value3 < value4);
//            System.out.println(value3 >= value4);
//            System.out.println(value3 <= value4);

//        boolean value5 = true;
//        boolean value6 = false;
//
//        System.out.println(value5 && value6);
//        System.out.println(value5 || value6);
//        System.out.println(!value5);

//        int ratingPoints = 100;
//
//        ratingPoints += 20;  // ratingPoints = ratingPoints + 20
//        System.out.println(ratingPoints);
//        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
//        System.out.println(ratingPoints);
//        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
//        System.out.println(ratingPoints);
//        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
//        System.out.println(ratingPoints);
//        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
//        System.out.println(ratingPoints);

        int activeUsers = 100;

        int prefix = ++activeUsers;
        int postfix = activeUsers++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);
    }
}
