import java.util.Locale;
import java.util.Scanner;

public class Tugas2KafeKampus13assign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale id = Locale.forLanguageTag("id-ID");

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        boolean jalan = true;
        while (jalan) {
            System.out.println();
            System.out.println("=== Kafe Kampus ===");
            System.out.println("1. Lihat daftar menu");
            System.out.println("2. Cari menu");
            System.out.println("3. Buat pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                // Daftar menu
                System.out.println("--- Daftar Menu ---");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println(String.format(id, "%d. %-16s Rp%,d", (i + 1), menu[i], harga[i]));
                }

            } else if (pilihan == 2) {
                // Pencarian menu (linear search)
                System.out.print("Masukkan nama menu yang dicari: ");
                String cari = input.nextLine().trim();

                int posisi = -1;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(cari)) {
                        posisi = i;
                        break;
                    }
                }

                if (posisi != -1) {
                    System.out.println(String.format(id, "Menu tersedia: %s, harga Rp%,d", menu[posisi], harga[posisi]));
                } else {
                    System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
                }

            } else if (pilihan == 3) {
                // Pemesanan
                System.out.print("Jumlah item yang dipesan: ");
                int jumlah = input.nextInt();
                input.nextLine();

                if (jumlah <= 0) {
                    System.out.println("Jumlah item harus lebih dari 0.");
                } else {
                    String[] pesanan = new String[jumlah];
                    int[] hargaPesanan = new int[jumlah];
                    int total = 0;

                    for (int i = 0; i < jumlah; i++) {
                        int posisi = -1;
                        while (posisi == -1) {
                            System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
                            String nama = input.nextLine().trim();

                            for (int j = 0; j < menu.length; j++) {
                                if (menu[j].equalsIgnoreCase(nama)) {
                                    posisi = j;
                                    break;
                                }
                            }
                            if (posisi == -1) {
                                System.out.println("Menu tidak tersedia, silakan ulangi.");
                            }
                        }
                        pesanan[i] = menu[posisi];
                        hargaPesanan[i] = harga[posisi];
                        total += harga[posisi];
                    }

                    // Struk pesanan
                    System.out.println();
                    System.out.println("========== PESANAN ANDA ==========");
                    for (int i = 0; i < pesanan.length; i++) {
                        System.out.println(String.format(id, "%d. %-16s Rp%,10d", (i + 1), pesanan[i], hargaPesanan[i]));
                    }
                    System.out.println("----------------------------------");
                    System.out.println(String.format(id, "   %-16s Rp%,10d", "TOTAL", total));
                    System.out.println("==================================");
                }

            } else if (pilihan == 0) {
                System.out.println("Terima kasih telah berkunjung.");
                jalan = false;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
