package br.com.osia;
import java.util.Scanner;

public class RecursiveFibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n (nth Fibonacci number): ");
        int n = scanner.nextInt();

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
        System.out.println("Fibonacci Sequence:");

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
            waitForEnter(scanner);
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);//2:1+0=2; 3=2+1=3; 4:3+2=5; 5:4+3=7; 6:5+4=9
        }
    }

    public static void waitForEnter(Scanner scanner) {
        System.out.print("Press Enter to continue...");
        scanner.nextLine();
    }
}
