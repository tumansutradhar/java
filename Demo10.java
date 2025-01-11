// class A {
//     public A() {
//         super(); // Every constructor has a "super()" call, even if you don't mention it explicitly
//         System.out.println("In A");
//     }

//     public A(int i) {
//         super();
//         System.out.println("Parametrize Constructor A");
//     }
// }

// class B extends A {
//     public B() {
//         super();
//         System.out.println("In B");
//     }

//     public B(int i) {
//         this();
//         System.out.println("Parametrize Constructor B");
//     }
// }

// class A {
//     public void show() {
//         System.out.println("Method Show In A");
//     }

//     public void config() {
//         System.out.println("Method Config In A");
//     }
// }

// class B extends A {
//     public void show() {
//         System.out.println("Method Show In B");
//     }
// }

// class myCalculator {
//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }
// }

// class calculatorOverriding extends myCalculator {
//     public int add(int n1, int n2) {
//         return n1 + n2 + 1;
//     }
// }

public class Demo10 {
    public static void main(String[] args) {
        // 34. Inheritance In Java
        // Calculator obj = new Calculator();

        // int addition = obj.add(5, 5);
        // int subtraction = obj.sub(5, 5);

        // System.out.println(addition);
        // System.out.println(subtraction);

        // BasicCalculator obj = new BasicCalculator();

        // int addition = obj.add(5, 5);
        // int subtraction = obj.sub(5, 5);
        // int multiply = obj.mul(5, 2);
        // int division = obj.div(10, 2);

        // System.out.println(addition);
        // System.out.println(subtraction);
        // System.out.println(multiply);
        // System.out.println(division);

        // 35. Single & Multilevel Inheritance In Java
        // AdvancedCalculator obj = new AdvancedCalculator();

        // double power = obj.power(5, 5);

        // System.out.println(power);

        // 36. This & Super Method In Java
        // B obj = new B();
        // B Obj = new B(5);

        // 37. Method Overriding In Java
        // B obj = new B();

        // obj.show();
        // obj.config();

        // calculatorOverriding calculator = new calculatorOverriding();

        // int result = calculator.add(5, 4);

        // System.out.println(result);
    }
}
