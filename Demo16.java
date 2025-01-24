// @FunctionalInterface
// interface lambdaReturn {
//     int add(int n1, int n2);
// }

// =============================================

// =============================================

// class CustomException extends Exception {
//     public CustomException(String message) {
//         super(message);
//     }
// }

// =============================================

// =============================================

// class Throws {
//     public void show() {
//         try {
//             Class.forName("override");
//         } catch (ClassNotFoundException e) {
//             System.out.println("Class Not Found Exception " + e.getMessage());
//         }
//     }
// }

// class newThrows {
//     public void show() throws ClassNotFoundException {
//         Class.forName("cal");
//     }
// }

public class Demo16 {
    public static void main(String[] args) {
        // 59. Lambda Expression With Return
        // lambdaReturn obj = (a, b) -> a + b;

        // int result = obj.add(5, 5);
        // System.out.println(result);

        // =============================================

        // =============================================

        // 60. Types Of Interface In Java
        // a) Marker Interface[doesn't have any methods or fields]
        // b) Single Abstract Method (SAM) Interface / Functional Interface[exactly one abstract method]
        // c) Normal Interface[multiple abstract methods as well as default and static methods]

        // =============================================

        // =============================================

        // 61. Exception Handling Using "try-catch" In Java
        // int n1 = 2;
        // int n2 = 0;

        // try {
        // n2 = 18 / n1;
        // } catch (Exception e) {
        // System.out.println("Something Went Wrong!");
        // }

        // System.out.println(n2);

        // =============================================

        // =============================================

        // 62. Multiple Catch Blocks In Java
        // try {
        // int result = 10 / 0;
        // int num[] = new int[5];
        // num[11] = 50;
        // String str = null;

        // System.out.println(str.length());
        // } catch (ArithmeticException e) {
        // System.out.println("Cannot divide by zero!");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array Index Out Of Bounds Exception");
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        // =============================================

        // =============================================

        // 63. Exception Throw Keyword In Java
        // try {
        // int age = 17;

        // if (age < 18) {
        // throw new IllegalArgumentException("Age must be greater than 18");
        // }
        // System.out.println("Age is valid");
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        // =============================================

        // =============================================

        // 64. Custom Exception In Java
        // int i = 20;
        // int j = 0;

        // try {
        // j = 18 / i;

        // if (j == 0) {
        // throw new CustomException("Not divide by " + i);
        // }
        // System.out.println("Division is valid");
        // } catch (CustomException e) {
        // j = 18 / 1;
        // System.out.println("Caught a custom exception: " + e.getMessage());
        // } catch (Exception e) {
        // System.out.println("An error occurred: " + e.getMessage());
        // }

        // =============================================

        // =============================================

        // 65. Ducking Exception Using Throws In Java
        // Throws obj = new Throws();
        // obj.show();

        // newThrows obj1 = new newThrows();

        // try {
        // obj1.show();
        // } catch (ClassNotFoundException e) {
        // e.printStackTrace();
        // }
    }
}
