import java.util.Scanner;

public class TugasParkir13assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Parkir ===");
        System.out.print("Jenis kendaraan (1=Motor, 2=Mobil): ");
        int jenis = sc.nextInt();
        System.out.print("Lama parkir (jam): ");
        int lama = sc.nextInt();

        if (jenis != 1 && jenis != 2) {
            System.out.println("Jenis kendaraan tidak valid");
        } else if (lama <= 0) {
            System.out.println("Lama parkir tidak valid");
        } else if (jenis == 1) {
            // Motor: Rp2.000 jam pertama + Rp1.000 per jam berikutnya
            int tarif = 2000 + (lama - 1) * 1000;
            System.out.println("Tarif parkir motor: Rp" + tarif);
        } else {
            // Mobil: Rp5.000 jam pertama + Rp3.000 per jam berikutnya
            int tarif = 5000 + (lama - 1) * 3000;
            System.out.println("Tarif parkir mobil: Rp" + tarif);
        }
        sc.close();
    }
}