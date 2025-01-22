// enum Laptop {
//     Macbook(69000), Zenbook(56000), TufGaming(60000);

//     private int price;

//     private Laptop(int price) {
//         this.price = price;
//     }

//     public int getPrice() {
//         return price;
//     }

//     public void setPrice(int price) {
//         this.price = price;
//     }
// }

// class Annotation {
//     public void show() {
//         System.out.println("Message from the annotation class!");
//     }
// }

// class newAnnotation extends Annotation {
//     @Override //The "@Override" annotation indicates that this method overrides a method in its superclass
//     public void show() {
//         System.out.println("Message from the new annotation class!");
//     }
// }

// @FunctionalInterface
// interface Sam { // Single Abstract Method (SAM) interfaces or functional interface
//     void execute(); // Single abstract method
//     // void run(); // This won't work because a functional interface can only have one abstract method
// }

// class functional implements Sam {
//     public void execute() {
//         System.out.println("Execute...");
//     }
// }

// @FunctionalInterface
// interface lambdaOperation {
//     void operate();
// }

// @FunctionalInterface
// interface Lambda {
//     void number(int i);
// }

public class Demo15 {
    public static void main(String[] args) {
        // 55. Enum Class In Java
        // Laptop laptop = Laptop.Macbook;

        // System.out.println("Price of " + laptop + ": " + laptop.getPrice());

        // laptop.setPrice(45000);

        // System.out.println("Updated price of " + laptop + ": " + laptop.getPrice());

        // for (Laptop laptop : Laptop.values()) {
        // System.out.println("Price of " + laptop + ": " + laptop.getPrice());
        // }

        // 56. Annotation In Java
        // newAnnotation obj = new newAnnotation();
        // obj.show();

        // 57. Functional Interface New In Java
        // Sam obj = new functional();

        // obj.execute();

        // Sam obj = new Sam() {
        // public void execute() {
        // System.out.println("Execute...");
        // }
        // };

        // obj.execute();

        // 58. Lambda Expression In Java
        // lambdaOperation obj = () -> System.out.println("Lambda Operation");

        // obj.operate();

        // Lambda obj1 = (int a) -> System.out.print(a);
        // Lambda obj2 = (a) -> System.out.println(a);

        // obj1.number(2022);
        // obj2.number(3045);
    }
}
