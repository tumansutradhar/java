// class staticVar {
//     String brand;
//     int price;
//     static String type; //Static Variable Belongs To The Class Not To The Object

//     public void show() {
//         System.out.println("The brand is " + brand + " & The price is " + price + " & The type is " + type);
//     }
// }

// class staticMethod {
//     String brand;
//     int price;
//     static String type;

//     public void show() {
//         System.out.println("The brand is " + brand + " & The price is " + price + " & The type is " + type);
//     }

//     public static void test(staticMethod a) {
//         System.out.println("The brand is " + a.brand + " & The price is " + a.price + " & The type is " + type);
//     }
// }

// class staticBlock {
//     String brand;
//     int price;
//     static String type;

//     public staticBlock() {
//         brand = "NULL";
//         price = 0;
//         System.out.println("In Constructor");
//     }

//     static {
//         type = "NONE";
//         System.out.println("In Static Block");
//     }

//     public void show() {
//         System.out.println("The brand is " + brand + " & The price is " + price + " & The type is " + type);
//     }
// }

public class Demo7 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 23. StringBuffer & StringBuilder In Java
        // StringBuffer sb = new StringBuffer();
        // StringBuffer sb1 = new StringBuffer("Tuman");

        // sb1.append(" Sutradhar");

        // System.out.println(sb.capacity());
        // System.out.println(sb1.capacity());
        // System.out.println(sb1);

        // 24. Static Variable In Java
        // staticVar obj1 = new staticVar();
        // obj1.brand = "Samsung";
        // obj1.price = 17500;
        // staticVar.type = "Smart Phone";

        // staticVar obj2 = new staticVar();
        // obj2.brand = "Xiaomi";
        // obj2.price = 14749;
        // staticVar.type = "Smart Phone";

        // staticVar.type = "Cell Phone"; // This Affects Both obj1 & obj2

        // obj1.show();
        // obj2.show();

        // 25. Static Method In Java
        // staticMethod obj1 = new staticMethod();
        // obj1.brand = "Samsung";
        // obj1.price = 17500;
        // staticMethod.type = "Smart Phone";

        // staticMethod obj2 = new staticMethod();
        // obj2.brand = "Xiaomi";
        // obj2.price = 14749;
        // staticMethod.type = "Smart Phone";

        // staticMethod.type = "Cell Phone";

        // obj1.show();
        // obj2.show();

        // staticMethod.test(obj1);

        // 26. Static Block In Java
        // staticBlock obj1 = new staticBlock();
        // obj1.brand = "Samsung";
        // obj1.price = 17500;
        // staticBlock.type = "Smart Phone";

        // staticBlock obj2 = new staticBlock();

        // Class.forName("staticBlock");
    }
}
