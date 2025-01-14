// class to class: extends
// class to interface: implements
// interface to interface: extends

// interface i {
//     void display();
// }

// interface n {
//     void show();
// }

// interface t {
//     void info();
// }

// interface e extends i, n {
// }

// class c implements t, e {
//     public void display() {
//         System.out.println("Displaying content...");
//     }

//     public void show() {
//         System.out.println("Showing details...");
//     }

//     public void info() {
//         System.out.println("Providing information...");
//     }
// }

// class Computer {
//     public void code() {
//     }
// }

// class Desktop extends Computer {
//     public void code() {
//         System.out.println("Work on projects using a Desktop");
//     }
// }

// class Laptop extends Computer {
//     public void code() {
//         System.out.println("Work on projects using a Laptop");
//     }
// }

// class Developer {
//     public void develop(Computer c) {
//         c.code();
//     }
// }

// enum Status {
//     SUCCESS, FAILURE, PENDING, IN_PROGRESS, CANCELLED
// }

public class Demo14 {
    public static void main(String[] args) {
        // 51. More On Interfaces In Java
        // c obj = new c();
        // obj.display();
        // obj.show();
        // obj.info();

        // 52. Need Of Interface In Java
        // Computer desktop = new Desktop();
        // Computer laptop = new Laptop();

        // Developer dev = new Developer();
        // dev.develop(desktop);
        // dev.develop(laptop);

        // 53. Enumeration(Enum) In Java
        // Status s = Status.SUCCESS;

        // System.out.println(s.ordinal()); // Print the index of the current status
        // value

        // Status[] t = Status.values();

        // for (Status a : t) // Loop through the array and print each value
        // System.out.println(a);

        // 54. Enum If & Switch In Java
        // Status u = Status.IN_PROGRESS;

        // a) If Conditional Statements
        // if (u == Status.SUCCESS)
        //     System.out.println("Success");
        // else if (u == Status.FAILURE)
        //     System.out.println("Failure");
        // else if (u == Status.PENDING)
        //     System.out.println("Pending");
        // else if (u == Status.IN_PROGRESS)
        //     System.out.println("In Progress");
        // else if (u == Status.CANCELLED)
        //     System.out.println("Cancelled");

        // b) Switch Case Statements
        // switch (u) {
        //     case SUCCESS -> System.out.println("Success");
        //     case FAILURE -> System.out.println("Failure");
        //     case PENDING -> System.out.println("Pending");
        //     case IN_PROGRESS -> System.out.println("In Progress");
        //     case CANCELLED -> System.out.println("Cancelled");
        //     default -> System.out.println("N/A");
        // }
    }
}
