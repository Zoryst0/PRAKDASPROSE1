package q2;
import java.util.Scanner;

public class q213 {
    public static void main(String[] args) {
        String nama = "Elia Beril"; 
        int noAbsen = 13;                  
        int k = noAbsen % 13;
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);

        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah kamar : ");
        int jumlahKamar = sc.nextInt();

        double maxTotal = -1;
        int kamarMax = 0;
        int jumlahRusak = 0;

        // Inner loop dijalankan tergantung dari seberapa banyak jumlah kamar yang di input👌(jika 2 kamar berarti 10 karena dikalikan 5 hari)
        for (int kamar = 1; kamar <= jumlahKamar; kamar++) {
            System.out.println("Kamar " + kamar);
            double total = 0;
            boolean rusak = false;
            int hariRusak = 0;

            for (int hari = 1; hari <= 5; hari++) {
                System.out.print("  Hari " + hari + " (kWh): ");
                double kwh = sc.nextDouble();
                if (kwh <= -1) {
                    rusak = true;
                    hariRusak = hari;
                    break;
                }
                total += kwh;
            }

            if (rusak) {
                jumlahRusak++;
                System.out.printf("  Total: %.2f | Rusak (hari ke-%d)%n", total, hariRusak);
            } else {
                double rata = total / 5;
                if (rata < 5 + k) {
                    System.out.printf("  Total: %.2f | Hemat%n", total);
                } else {
                    System.out.printf("  Total: %.2f | Boros%n", total);
                }
                // pakai ">" (bukan ">=") supaya kalau seri, nomor kamar terkecil tetap menang / nomor yang dluan diisi tetap terpilih kalau seri (kamar 1 dan 2 kwhnya sama" 19 tapi yang boros tetap kamar 1 karena diisi terlebih dahulu)
                if (total > maxTotal) {
                    maxTotal = total;
                    kamarMax = kamar;
                }
            }
        } sc.close();

        System.out.println("_/--/__/--/__/--/__/--/_");
        if (kamarMax == 0) {
            System.out.println("Kamar paling boros  : -");
            System.out.printf("Total kWh tertinggi : %.2f%n", 0.0);
        } else {
            System.out.println("Kamar paling boros  : " + kamarMax);
            System.out.printf("Total kWh tertinggi : %.2f%n", maxTotal);
        }
        System.out.println("Jumlah meteran rusak: " + jumlahRusak);
    }
}