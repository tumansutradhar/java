public class Demo2 {
    public static void main(String[] args) {
        // 7. Relational Operators In Java
        // int x = 8;
        // int y = 4;

        // boolean result = x < y; // Less Than
        // boolean result = x > y; // Greater Than
        // boolean result = x != y; // Not Equal
        // boolean result = x == y; // Double Equal

        // System.out.println(result);

        // int x = 8;
        // int y = 8;

        // boolean result = x > y; // false
        // boolean result = x >= y; // true

        // System.out.println(result);

        // double x = 9.99;
        // double y = 10.4;

        // boolean result = x <= y; // Less Than Equal
        // boolean result = x >= y; // Greater Than Equal

        // System.out.println(result);

        // 8. Logical Operators In Java
        // a) AND Operator(&&):
        // true && true -> true
        // true && false -> false
        // false && true -> false
        // false && false -> false

        // b) OR Operator(||):
        // true || true -> true
        // true || false -> true
        // false || true -> true
        // false || false -> false

        // c) NOT Operator(!):
        // true -> false
        // false -> true

        // int x = 8;
        // int y = 10;
        // int a = 8;
        // int b = 5;

        // boolean result = x < y && a > b;
        // boolean result = x > y || a > b;

        // System.out.println(result);

        // boolean result = x > y;

        // System.out.println(!result);

        // 9. Conditional Statement In Java
        // int x = 7;
        // int y = 8;

        // if (x > y) {
        // System.out.print("X is: ");
        // System.out.println(x);
        // } else {
        // System.out.print("Y is: ");
        // System.out.println(y);
        // }

        // int a = 8;
        // int b = 10;
        // int c = 5;

        // if (a > b && a > c)
        // System.out.println("a is Grater than b & c");
        // else if (b > a && b > c)
        // System.out.println("b is Grater than a & c");
        // else
        // System.out.println("c is Grater than b & a");

        // 10. Ternary Operator In Java
        // int i = 4;
        // int result = 0;

        // if (i % 2 == 0)
        // result = 10;
        // else
        // result = 20;

        // result = i % 2 == 0 ? 10 : 20;

        // System.out.println(result);

        // 11. Switch Statement In Java
        // int i = 1;

        // if (i == 1)
        // System.out.println("Sunday");
        // else if (i == 2)
        // System.out.println("Monday");
        // else if (i == 3)
        // System.out.println("Tuesday");
        // else if (i == 4)
        // System.out.println("Wednesday");
        // else if (i == 5)
        // System.out.println("Thursday");
        // else if (i == 6)
        // System.out.println("Friday");
        // else
        // System.out.println("Saturday");

        // int i = 8;

        // switch (i) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // break;
        // case 5:
        // System.out.println("Thursday");
        // break;
        // case 6:
        // System.out.println("Friday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Enter NUMBER between 1 to 7");
        // break;
        // }

        // String day = "Sunday";

        // switch (day) {
        // case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
        // System.out.println("College Start from 10am");
        // break;
        // default:
        // System.out.println("Holiday");
        // break;
        // }

        // switch (day) {
        // case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
        // System.out.println("College Start from 10am");
        // default ->
        // System.out.println("Holiday");
        // }

        // String day = "Sunday";
        // String totalClass = "";

        // switch (day) {
        // case "Sunday", "Saturday" -> totalClass = "No class It's Holiday";
        // default -> totalClass = "5";
        // }

        // totalClass = switch (day) {
        // case "Sunday", "Saturday" -> "No class It's Holiday";
        // default -> "5";
        // };

        // If you want to use ":" then use "yield"
        // totalClass = switch (day) {
        // case "Sunday", "Saturday":
        // yield "No class It's Holiday";
        // default:
        // yield "5";
        // };

        // System.out.println(totalClass);
    }
}
