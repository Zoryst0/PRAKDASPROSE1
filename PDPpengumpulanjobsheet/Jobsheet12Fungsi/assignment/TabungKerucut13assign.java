package PDP

import java.util.Locale;
import java.util.Scanner;

public class TabungKerucut13assign {

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    static double volumeTabung(double r, double t) {
        return luasLingkaran(r) * t;
    }

    static double luasPermukaanTabung(double r, double t) {
        // 2 x luas alas + keliling alas x tinggi
        return 2 * luasLingkaran(r) + 2 * Math.PI * r * t;
    }

    static double volumeKerucut(double r, double t) {
        return volumeTabung(r, t) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);   // desimal memakai titik, mis. 7.5
        Locale id = Locale.forLanguageTag("id-ID");

        int pilihan;
        do {
            System.out.println();
            System.out.println("=== Menu Bangun Ruang ===");
            System.out.println("1. Luas lingkaran");
            System.out.println("2. Volume tabung");
            System.out.println("3. Luas permukaan tabung");
            System.out.println("4. Volume kerucut");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan jari-jari (r): ");
                double r = sc.nextDouble();
                double t = 0;
                if (pilihan != 1) {
                    System.out.print("Masukkan tinggi (t): ");
                    t = sc.nextDouble();
                }

                if (r <= 0 || (pilihan != 1 && t <= 0)) {
                    System.out.println("Ukuran harus lebih dari 0.");
                } else if (pilihan == 1) {
                    System.out.println(String.format(id, "Luas lingkaran = %.2f", luasLingkaran(r)));
                } else if (pilihan == 2) {
                    System.out.println(String.format(id, "Volume tabung = %.2f", volumeTabung(r, t)));
                } else if (pilihan == 3) {
                    System.out.println(String.format(id, "Luas permukaan tabung = %.2f", luasPermukaanTabung(r, t)));
                } else {
                    System.out.println(String.format(id, "Volume kerucut = %.2f", volumeKerucut(r, t)));
                }
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        System.out.println("Program selesai.");
    }
}
