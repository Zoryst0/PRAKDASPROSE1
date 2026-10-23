// Tugas1Bioskop13assign.java
import java.util.Scanner;

public class Tugas1Bioskop13assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.println("=== Penjualan Tiket Bioskop ===");

        while (true) {
            System.out.print("Jumlah tiket yang dibeli pelanggan (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double bayar = jumlahTiket * HARGA_TIKET * (1 - diskon);
            System.out.println("Diskon: " + (int) (diskon * 100) + "% | Total bayar: Rp" + (long) bayar);

            totalTiket += jumlahTiket;
            totalPenjualan += bayar;
        }
        

        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp" + (long) totalPenjualan);
        sc.close();
    } 
}
