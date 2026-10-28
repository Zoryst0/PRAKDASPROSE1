// Task113assign.java (Assignment 1: Nested Number Pattern)
import java.util.Scanner;

public class Task113assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter the value of n = ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("n must be at least 1. Retry!");
            }
        } while (n < 1);

        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print(" ");
                }
                System.out.print(j);
                total++;
            }
            System.out.println();
        }

        System.out.println("Total numbers printed: " + total);
        sc.close();
    }
}
