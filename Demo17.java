// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

// class Input {
//     public void read() throws IOException {
//         System.out.print("Enter any key: ");
//         int i = System.in.read();
//         System.out.println("ASCII value: " + i);
//         System.out.println("You entered the number: " + (i - 48));
//     }

//     public void input() throws IOException {
//         System.out.print("Enter any key: ");
//         InputStreamReader in = new InputStreamReader(System.in);
//         BufferedReader br = new BufferedReader(in);
//         int n = Integer.parseInt(br.readLine());
//         System.out.println(n);
//         br.close();
//     }
// }

// =============================================

// =============================================

// class Resource {
//     public void tryWithResources() throws IOException {
//         BufferedReader br = null;

//         try {
//         System.out.print("Enter any number: ");
//         InputStreamReader in = new InputStreamReader(System.in);
//         br = new BufferedReader(in);
//         int num = Integer.parseInt(br.readLine());
//         System.out.println(num);
//         } finally {
//         br.close();
//         }

//         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//             System.out.print("Enter any number: ");
//             int num = Integer.parseInt(br.readLine());
//             System.out.println(num);
//         }
//     }
// }

// =============================================

// =============================================

// class threadOne extends Thread{
//     public void run(){
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }

// class threadTwo extends Thread{
//     public void run(){
//         for (int i = 1; i <= 100; i++) {
//             System.out.println(i);
//         }
//     }
// }

public class Demo17 {
    public static void main(String[] args) {
        // 66. User Input Using BufferedReader & Scanner In Java
        // Input input = new Input();
        // try {
        // input.read();
        // } catch (IOException e) {
        // System.out.println("An error occurred: " + e.getMessage());
        // }

        // try {
        // input.input();
        // } catch (IOException e) {
        // System.out.println("An error occurred: " + e.getMessage());
        // }

        // System.out.print("Enter any number: ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(num);

        // =============================================

        // =============================================

        // 67. Try With Resources In Java
        // Resource resource = new Resource();
        // try {
        // resource.tryWithResources();
        // } catch (IOException e) {
        // System.out.println("An error occurred: " + e.getMessage());
        // }

        // =============================================

        // =============================================

        // 68. Threads In Java
        // threadOne t1 = new threadOne();
        // threadTwo t2 = new threadTwo();

        // t1.start();
        // t2.start();
    }
}
