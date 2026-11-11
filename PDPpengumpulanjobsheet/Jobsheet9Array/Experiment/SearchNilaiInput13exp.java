package PDPpengumpulanjobsheet.Jobsheet9Array.Experiment;
import java.util.Scanner;

public class SearchNilaiInput13exp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Banyaknya elemen harus lebih dari 0.");
            return;
        }

        int[] nilai = new int[n];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = input.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: " + key
                    + " tidak ada di dalam array yang berisi " + n + " elemen.");
        }
    }
}
