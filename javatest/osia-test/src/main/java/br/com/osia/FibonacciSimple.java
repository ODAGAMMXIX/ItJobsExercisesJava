// package br.com.osia;

// public class FibonacciSimple{
    

// public static int fibonacci(int n) {
    
//         if (n <= 1) {
//             return n;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }   

// public static void main(String[] args){
//     int n = 20;

//     System.out.println(fibonacci(n));

// }
// }
// package br.com.osia;

// public class FibonacciSimple {
//     public static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
//     }
// }

package br.com.osia;

public class FibonacciSimple {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        
        int n = 10;
        
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}