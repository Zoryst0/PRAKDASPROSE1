// Task213assign.java (Assignment 2: Multiplication Table)
import java.util.Scanner;

public class Task213assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter the value of n = ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("n must be at least 3. Retry!");
            }
        } while (n < 3);

        // lebar kolom menyesuaikan angka terbesar (n * n), minimal 4 karakter
        int width = Math.max(4, String.valueOf((long) n * n).length() + 2);
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;
                System.out.printf("%" + width + "d", result);
                sum += result;
            }
            System.out.println();
        }

        System.out.println("Total of all numbers: " + sum);
        sc.close();
    }
}
