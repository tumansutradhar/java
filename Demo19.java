// import java.util.Iterator;
// import java.util.Set;
// import java.util.TreeSet;

// class Counter {
//     int i;

//     public synchronized void increment() {
//         i++;
//     }
// }

public class Demo19 {
    public static void main(String[] args) {
        // 71. Race Condition In Java
        // Counter c = new Counter();

        // Runnable r1 = () -> {
        // for (int i = 1; i <= 1000; i++) {
        // c.increment();
        // }
        // };

        // Runnable r2 = () -> {
        // for (int i = 1; i <= 1000; i++) {
        // c.increment();
        // }
        // };

        // Thread t1 = new Thread(r1);
        // Thread t2 = new Thread(r2);

        // t1.start();
        // t2.start();

        // try {
        // t1.join();
        // t2.join();
        // } catch (InterruptedException ex) {
        // }

        // System.out.println(c.i);

        // =============================================

        // =============================================

        // 72. ArrayList In Java
        // Collection<Integer> n = new ArrayList<Integer>();
        // n.add(9);
        // n.add(3);
        // n.add(5);
        // n.add(1);

        // for (int i : n) {
        // System.out.println(i);
        // }

        // System.out.println(n);

        // =============================================

        // =============================================

        // 73. List In Java
        // List<Integer> a = new ArrayList<Integer>();
        // a.add(5);
        // a.add(3);
        // a.add(1);
        // a.add(9);

        // System.out.println(a.get(1));
        // System.out.println(a.set(0, 6));
        // System.out.println(a.indexOf(9));

        // for (int i : a) {
        // System.out.println(i);
        // }

        // System.out.println(a);

        // =============================================

        // =============================================

        // 74. Set In Java
        // Set<Integer> s = new HashSet<Integer>();
        // s.add(55);
        // s.add(37);
        // s.add(94);
        // s.add(14);
        // s.add(92);

        // System.out.println(s.contains(3));

        // for (int i : s) {
        // System.out.println(i);
        // }

        // Set<Integer> s = new TreeSet<Integer>();
        // s.add(55);
        // s.add(37);
        // s.add(94);
        // s.add(14);
        // s.add(92);

        // Iterator<Integer> i = s.iterator();

        // System.out.println(i.next());

        // while (i.hasNext()) {
        // System.out.println(i.next());
        // }

        // for (int n : s) {
        // System.out.println(n);
        // }
    }
}
