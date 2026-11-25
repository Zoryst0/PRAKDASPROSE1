package PDPpengumpulanjobsheet.Jobsheet12Fungsi.experiment;

import java.util.Locale;
import java.util.Scanner;

public class Kafe13exp {

    // Percobaan 1, Pertanyaan 1: fungsi tanpa parameter yang mengembalikan nilai
    public static int jumlahMenu() {
        return 6;
    }

    // Percobaan 1 dan 2: fungsi Menu dengan parameter (ditambah jamKunjung pada Pertanyaan 4)
    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    // Percobaan 3: fungsi dengan nilai kembalian
    public static int hitungTotalHarga13(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    // Percobaan 3, Pertanyaan 4: mengembalikan nominal diskon
    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int persen = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            persen = 50;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            persen = 30;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            persen += 10;   // tambahan diskon member
        }

        // Kalikan dulu baru bagi 100 agar hasil int tidak terpotong
        return total * persen / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale id = Locale.forLanguageTag("id-ID");

        System.out.print("Nama pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Member? (y/n): ");
        boolean isMember = sc.nextLine().equalsIgnoreCase("y");
        System.out.print("Jam kunjung (0-23): ");
        int jam = sc.nextInt();
        sc.nextLine();

        Menu(nama, isMember, jam);

        int totalHarga = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu (0 = selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }
            if (pilihanMenu < 1 || pilihanMenu > jumlahMenu()) {
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            if (banyakItem <= 0) {
                System.out.println("Jumlah item harus lebih dari 0");
                continue;
            }

            int totalBayar = hitungTotalHarga13(pilihanMenu, banyakItem);
            System.out.println(String.format(id, "Subtotal menu %d: Rp%,d", pilihanMenu, totalBayar));
            totalHarga += totalBayar;
        }
        sc.nextLine();

        System.out.print("Kode promo (kosongkan bila tidak ada): ");
        String kodePromo = sc.nextLine().trim();

        int diskon = hitungDiskon(totalHarga, kodePromo, isMember);
        int totalAkhir = totalHarga - diskon;

        System.out.println();
        System.out.println(String.format(id, "Total harga       : Rp%,d", totalHarga));
        System.out.println(String.format(id, "Diskon            : Rp%,d", diskon));
        System.out.println(String.format(id, "Total yang dibayar: Rp%,d", totalAkhir));
    }
}
