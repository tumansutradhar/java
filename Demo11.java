// import Packages.Calculator;
// import AccessModifiers.*;

// class d extends Modifiers1 {
//     public void f() {
//         System.out.println(c);
//     }
// }

// class Dynamic {
//     public void show() {
//         System.out.println("In Dynamic Class");
//     }
// }

// class dynamicMethodDispatch extends Dynamic {
//     public void show() {
//         System.out.println("In Dynamic Method Dispatch Class");
//     }
// }

// final class Calculator {
//     public void show() {
//         System.out.print("Result: ");
//     }

//     public void add(int n1, int n2) {
//         System.out.println(n1 + n2);
//     }
// }

// class advanceCalculator extends Calculator {
//     public void subtraction(int n1, int n2) {
//         System.out.println(n1 - n2);
//     }
// }

// class Calculator {
//     public final void show() {
//         System.out.print("Result: ");
//     }

//     public void add(int n1, int n2) {
//         System.out.println(n1 + n2);
//     }
// }

// class AdvanceCalculator extends Calculator {
//     public void show() {
//         System.out.println("Answer: ");
//     }
// }

public class Demo11 {
    public static void main(String[] args) {
        // 38. Packages In Java
        // Calculator calculator = new Calculator();

        // int result = calculator.add(5, 5);

        // System.out.println(result);

        // 39. Access Modifiers In Java
        // Modifiers1 obj = new Modifiers1();

        // System.out.println(obj.a);

        // Modifiers2 obj2 = new Modifiers2();

        // 40. Polymorphism In Java [Poly means Many & Morphism means Behavior]
        // a) Compile-time (or Static) Polymorphism: Achieved using method overloading
        // and operator overloading.
        // b) Runtime (or Dynamic) Polymorphism: Achieved using method overriding.

        // 41. Dynamic Method Dispatch In Java
        // DynamicMethodDispatch dmp = new DynamicMethodDispatch();
        // dmp.show();

        // Dynamic d = new dynamicMethodDispatch(); // "d" type is "dynamic" & its implementation is from the class "DynamicMethodDispatch"
        // d.show();

        // 42. Final Keyword In Java [Final means Constant]
        // Final With -> Variable, Class, Method
        // a) Variable
        // final int n = 99;
        // n = 100;
        // System.out.println(n);

        // b) Class
        // Calculator cal = new Calculator();
        // cal.show();
        // cal.add(5, 5);

        // c) Method
        // AdvanceCalculator advCal = new AdvanceCalculator();
        // advCal.show();
    }
}
