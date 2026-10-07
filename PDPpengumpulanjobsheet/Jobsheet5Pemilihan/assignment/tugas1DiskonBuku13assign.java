import java.util.Scanner;

public class tugas1DiskonBuku13assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Diskon Toko Buku ===");
        System.out.print("Apakah pembeli member? (true/false): ");
        boolean member = sc.nextBoolean();
        System.out.print("Total belanja (Rp): ");
        double totalBelanja = sc.nextDouble();

        double persenDiskon;

        if (member) {
            if (totalBelanja >= 500000) {
                persenDiskon = 20;
            } else if (totalBelanja >= 200000) {
                persenDiskon = 10;
            } else {
                persenDiskon = 5;
            }
        } else {
            if (totalBelanja >= 500000) {
                persenDiskon = 10;
            } else {
                persenDiskon = 0;
            }
            sc.close();
        }

        double potongan = totalBelanja * persenDiskon / 100;
        double totalBayar = totalBelanja - potongan;

        System.out.println("Diskon      : " + persenDiskon + "%");
        System.out.println("Potongan    : Rp" + (long) potongan);
        System.out.println("Total bayar : Rp" + (long) totalBayar);
    }
}