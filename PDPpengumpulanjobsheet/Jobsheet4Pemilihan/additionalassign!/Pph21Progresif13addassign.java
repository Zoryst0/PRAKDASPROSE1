import java.util.Locale;
import java.util.Scanner;

public class Pph21Progresif13addassign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Kalkulator PPh 21 Progresif ===");
        System.out.print("Masukkan PKP tahunan (Rp): ");
        double pkp = sc.nextDouble();

        final double BATAS_1 = 60_000_000;
        final double BATAS_2 = 250_000_000;
        final double BATAS_3 = 500_000_000;

        double pajak;

        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= BATAS_1) {
            pajak = 0.05 * pkp;
        } else if (pkp <= BATAS_2) {
            pajak = (0.05 * BATAS_1) + 0.15 * (pkp - BATAS_1);
        } else if (pkp <= BATAS_3) {
            pajak = (0.05 * BATAS_1) + (0.15 * (BATAS_2 - BATAS_1))
                    + 0.25 * (pkp - BATAS_2);
        } else {
            pajak = (0.05 * BATAS_1) + (0.15 * (BATAS_2 - BATAS_1))
                    + (0.25 * (BATAS_3 - BATAS_2)) + 0.30 * (pkp - BATAS_3);
        }

        System.out.printf(Locale.forLanguageTag("id-ID"), "PPh 21 terutang: Rp%,.0f%n", pajak);
        sc.close();
    }
}