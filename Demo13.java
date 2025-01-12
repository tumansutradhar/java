// abstract class Car {
//     public abstract void drive();

//     public void playMusic() {
//         System.out.println("Play Music");
//     }
// }

// class Bmw extends Car {
//     public void drive() {
//         System.out.println("Driving");
//     }
// }

// class parent {
//     public void show() {
//         System.out.println("In Parent");
//     }

//     // class child { // The non-static inner class
//     static class child { // Static inner class
//         public void display() {
//             System.out.println("In Child");
//         }
//     }
// }

// class Anonymous {
//     public void show() {
//         System.out.println("In Anonymous Class");
//     }
// }

// abstract class abstractAnonymous {
//     public abstract void display();
// }

interface myInterface {
    int i = 66; // Final and static by default
    String s = "Tuman"; // Final and static by default

    void show();

    void display();
}

class myClass implements myInterface {
    public void show() {
        System.out.println("In The Show");
    }

    public void display() {
        System.out.println("In The Display");
    }
}

public class Demo13 {
    public static void main(String[] args) {
        // 46. Abstract Keyword In Java
        // Car newCar = new Car(); // Can't Instantiate An Abstract Class
        // Car newCar = new Bmw(); // Bmw is a concrete class
        // newCar.drive();
        // newCar.playMusic();

        // 47. Inner Class In Java
        // parent p = new parent();
        // p.show();

        // // parent.child c = p.new child(); // The non-static inner class object
        // parent.child c = new parent.child(); // Static inner class object
        // c.display();

        // 48. Anonymous Inner Class In Java
        // Anonymous anonymous = new Anonymous() {
        // public void show() {
        // System.out.println("In Anonymous Object");
        // }
        // };

        // anonymous.show();

        // 49. Abstract & Anonymous Inner Class
        // abstractAnonymous newAbstractAnonymous = new abstractAnonymous() {
        // public void display() {
        // System.out.println("In Abstract Anonymous Object");
        // }
        // };

        // newAbstractAnonymous.display();

        // 50. Interface In Java
        // myInterface Interface = new myClass();
        // Interface.show();
        // Interface.display();

        // System.out.println(myInterface.i);
        // System.out.println(myInterface.s);
    }
}
