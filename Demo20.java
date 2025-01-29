// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.HashMap;
// import java.util.Map;

// class Student {
//     int age;
//     String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }
// }

// class newStudent implements Comparable<newStudent> {
//     int age;
//     String name;

//     public newStudent(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }

//     public int compareTo(newStudent that) {
//         if (this.age > that.age) {
//             return 1;
//         } else {
//             return -1;
//         }
//     }
// }

// OR

// class newStudent {
//     int age;
//     String name;

//     public newStudent(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }
// }

public class Demo20 {
    public static void main(String[] args) {
        // 75. Map In Java
        // Map<String, Integer> m = new HashMap<>();
        // m.put("A", 10);
        // m.put("B", 20);
        // m.put("C", 30);
        // m.put("D", 40);

        // System.out.println(m);

        // for (String a : m.keySet()) {
        // System.out.println(a + " : " + m.get(a));
        // }

        // =============================================

        // =============================================

        // 76. Comparator VS Comparable In Java
        // List<Integer> l = new ArrayList<>();

        // l.add(10);
        // l.add(5);
        // l.add(20);
        // l.add(15);

        // System.out.println(l);

        // Collections.sort(l);

        // System.out.println(l);

        // Comparator<Integer> c = new Comparator<Integer>(){
        // public int compare (Integer i, Integer j) {
        // if (i % 10 > j % 10) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        // l.add(23);
        // l.add(15);
        // l.add(19);
        // l.add(22);

        // Collections.sort(l, c);

        // System.out.println(l);

        // Comparator<Student> c = new Comparator<Student>() {
        // public int compare(Student i, Student j) {
        // if (i.age > j.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        // OR

        // Comparator<Student> c = (i, j) -> i.age > j.age ? 1 : -1;

        // List<Student> s = new ArrayList<>();

        // s.add(new Student(21, "Tuman"));
        // s.add(new Student(12, "Dhananjay"));
        // s.add(new Student(2, "Sunita"));

        // Collections.sort(s, c);

        // for (Student a : s) {
        // System.out.println(a);
        // }

        // List<newStudent> n = new ArrayList<>();

        // n.add(new newStudent(21, "Sutradhar"));
        // n.add(new newStudent(22, "<Mallick>"));
        // n.add(new newStudent(20, "Saha"));

        // Collections.sort(n);

        // for (newStudent a : n) {
        // System.out.println(a);
        // }
    }
}
