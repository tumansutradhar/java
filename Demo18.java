// class tOne extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("One " + i);
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class tTwo extends Thread {
//     public void run() {
//         for (int i = 1; i <= 100; i++) {
//             System.out.println("Two " + i);
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// =============================================

// =============================================

// class runnableOne implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("One " + i);
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class runnableTwo implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Two " + i);
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Demo18 {
    public static void main(String[] args) {
        // 69. Thread Priority & Sleep In Java
        // tOne t1 = new tOne();
        // tTwo t2 = new tTwo();

        // t1.setPriority(1);
        // t2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(t1.getPriority());
        // System.out.println(t2.getPriority());

        // t1.start();
        // t2.start();

        // =============================================

        // =============================================

        // 70. Runnable VS Thread In Java
        // runnableOne r1 = new runnableOne();
        // runnableTwo r2 = new runnableTwo();

        // Thread t1 = new Thread(r1);
        // Thread t2 = new Thread(r2);

        // t1.start();
        // t2.start();

        // Runnable r1 = () -> {
        // for (int i = 1; i <= 5; i++) {
        // System.out.println("r1 " + i);
        // try {
        // Thread.sleep(100);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // };

        // Runnable r2 = () -> {
        // for (int i = 1; i <= 5; i++) {
        // System.out.println("r2 " + i);
        // try {
        // Thread.sleep(100);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // };

        // Thread t1 = new Thread(r1);
        // Thread t2 = new Thread(r2);

        // t1.start();
        // t2.start();
    }
}
