import java.util.Scanner;

public class BioskopWithScanner13exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        boolean jalan = true;
        while (jalan) {
            System.out.println();
            System.out.println("=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                // Menu 1: input data penonton
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    // Ulangi sampai kursi valid (dalam rentang) dan masih kosong
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length) {
                            System.out.println("Baris tidak tersedia. Pilih baris 1 sampai " + penonton.length + ".");
                        } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                            System.out.println("Kolom tidak tersedia. Pilih kolom 1 sampai " + penonton[baris - 1].length + ".");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi (" + baris + "," + kolom + ") sudah terisi oleh "
                                    + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();

                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (menu == 2) {
                // Menu 2: tampilkan daftar penonton (kursi kosong = ***)
                System.out.println("--- Daftar Penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ":");
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(" \t" + isi);
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih.");
                jalan = false;

            } else {
                System.out.println("Menu tidak valid.");
            }
        }
    }
}
