import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar N: ");
        int n = scanner.nextInt();

        System.out.println("Sirul Fibonacci pana la " + n + " este:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int fib = 0;
            int prev1 = 1;
            int prev2 = 0;

            for (int i = 2; i <= n; i++) {
                fib = prev1 + prev2;
                prev2 = prev1;
                prev1 = fib;
            }

            return fib;
        }
    }
}
