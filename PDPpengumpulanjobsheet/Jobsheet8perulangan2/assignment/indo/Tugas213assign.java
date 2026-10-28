// Tugas213assign.java (Tugas 2: Tabel Perkalian)
import java.util.Scanner;

public class Tugas213assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("n minimal 3. Ulangi input!");
            }
        } while (n < 3);

        // lebar kolom menyesuaikan angka terbesar (n * n), minimal 4 karakter
        int lebar = Math.max(4, String.valueOf((long) n * n).length() + 2);
        long jumlah = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%" + lebar + "d", hasil);
                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);
        sc.close();
    }
}
