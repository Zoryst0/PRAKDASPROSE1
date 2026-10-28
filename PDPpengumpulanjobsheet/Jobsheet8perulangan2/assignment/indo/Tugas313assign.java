// Tugas313assign.java (Tugas 3: Rekap Penjualan Beberapa Toko)
import java.util.Scanner;

public class Tugas313assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalBarangSemua = 0;
        int tokoTerbaik = 0;
        int barangTerbanyak = -1;      // -1: toko pertama selalu tercatat (walau 0 barang)

        for (int t = 1; t <= jumlahToko; t++) {
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan toko " + t + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);

            int barangToko = 0;
            for (int p = 1; p <= jumlahPelanggan; p++) {
                int jumlahBarang;
                do {
                    System.out.print("  Barang dibeli pelanggan " + p + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahBarang < 0);
                barangToko += jumlahBarang;
            }

            System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + barangToko);

            totalBarangSemua += barangToko;
            if (barangToko > barangTerbanyak) {   // '>' : jika seri, toko bernomor kecil tetap dipilih
                barangTerbanyak = barangToko;
                tokoTerbaik = t;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        sc.close();
    }
}
