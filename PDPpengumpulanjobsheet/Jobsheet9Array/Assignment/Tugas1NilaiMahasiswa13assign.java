import java.util.Scanner;

public class Tugas1NilaiMahasiswa13assign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Pengelolaan Nilai Mahasiswa ===");
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Banyaknya nilai harus lebih dari 0.");
            return;
        }

        int[] nilai = new int[jumlah];
        int total = 0;

        // Input nilai satu per satu
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        // Rata-rata
        double rataRata = (double) total / nilai.length;

        // Nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        // Tampilkan semua nilai beserta status kelulusan
        System.out.println();
        System.out.println("--- Daftar Nilai ---");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println();
        System.out.println("--- Ringkasan ---");
        System.out.println("Rata-rata      : " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}
