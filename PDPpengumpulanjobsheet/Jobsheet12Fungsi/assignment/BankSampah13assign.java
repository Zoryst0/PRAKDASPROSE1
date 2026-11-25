import java.util.Locale;
import java.util.Scanner;

public class BankSampah13assign {

    static Scanner sc = new Scanner(System.in);
    static Locale id = Locale.forLanguageTag("id-ID");

    // Membaca berat setoran tiap nasabah dan mengembalikannya sebagai array
    static double[] inputSetoran(int n) {
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("--- Data Setoran ---");
        for (int i = 0; i < setoran.length; i++) {
            System.out.println(String.format(id, "Nasabah ke-%d : %.2f kg", (i + 1), setoran[i]));
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;
        for (double berat : setoran) {
            total += berat;
        }
        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }

    // Mengembalikan indeks nasabah dengan setoran terbesar
    static int nasabahTerbanyak(double[] setoran) {
        int indeks = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[indeks]) {
                indeks = i;
            }
        }
        return indeks;
    }

    public static void main(String[] args) {
        sc.useLocale(Locale.US);   // desimal memakai titik, mis. 12.5
        final double HARGA_PER_KG = 3000;

        System.out.println("=== Bank Sampah ===");
        System.out.print("Jumlah nasabah (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah nasabah harus lebih dari 0.");
            return;
        }

        double[] setoran = inputSetoran(n);

        System.out.println();
        tampilSetoran(setoran);

        System.out.println();
        System.out.println("--- Saldo Setiap Nasabah (Rp3.000 per kg) ---");
        for (int i = 0; i < setoran.length; i++) {
            double saldo = hitungSaldo(setoran[i], HARGA_PER_KG);
            System.out.println(String.format(id, "Nasabah ke-%d : Rp%,.0f", (i + 1), saldo));
        }

        System.out.println();
        System.out.println(String.format(id, "Total setoran seluruh nasabah: %.2f kg", totalSetoran(setoran)));

        int terbanyak = nasabahTerbanyak(setoran);
        System.out.println(String.format(id, "Setoran terbanyak: nasabah ke-%d (%.2f kg)", (terbanyak + 1), setoran[terbanyak]));
    }
}
