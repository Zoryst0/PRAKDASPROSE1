import java.util.Locale;
import java.util.Scanner;

public class TugasMandiriSurvei13assign {
    public static void main(String[] args) {
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        Scanner sc = new Scanner(System.in);
        Locale id = Locale.forLanguageTag("id-ID");

        int[][] jawaban = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        // 1. Input hasil survei (jawaban 1 sampai 5)
        System.out.println("=== Survei: 10 responden x 6 pertanyaan ===");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int nilai;
                do {
                    System.out.print("  Pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("  Jawaban harus 1 sampai 5.");
                    }
                } while (nilai < 1 || nilai > 5);
                jawaban[i][j] = nilai;
            }
        }

        // 2. Tampilkan matriks jawaban
        System.out.println();
        System.out.println("=== Hasil Survei ===");
        System.out.print("Responden |");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            System.out.print(" P" + (j + 1));
        }
        System.out.println();
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.print(String.format("%9d |", (i + 1)));
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                System.out.print("  " + jawaban[i][j]);
            }
            System.out.println();
        }

        // 3. Rata-rata setiap responden (sekaligus menjumlahkan total keseluruhan)
        double totalSemua = 0;
        System.out.println();
        System.out.println("--- Rata-rata setiap responden ---");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double totalResponden = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalResponden += jawaban[i][j];
            }
            totalSemua += totalResponden;
            System.out.println(String.format(id, "Responden ke-%d : %.2f", (i + 1), totalResponden / JUMLAH_PERTANYAAN));
        }

        // 4. Rata-rata setiap pertanyaan
        System.out.println();
        System.out.println("--- Rata-rata setiap pertanyaan ---");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPertanyaan += jawaban[i][j];
            }
            System.out.println(String.format(id, "Pertanyaan %d : %.2f", (j + 1), totalPertanyaan / JUMLAH_RESPONDEN));
        }

        // 5. Rata-rata keseluruhan
        System.out.println();
        System.out.println(String.format(id, "Rata-rata keseluruhan: %.2f",
                totalSemua / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN)));
    }
}
