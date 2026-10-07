import java.util.Scanner;

public class UgdHarapanKita13addassign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== UGD RS Harapan Kita - Alokasi Ruang ===");
        System.out.print("SpO2 (%): ");
        double spo2 = sc.nextDouble();
        System.out.print("Sisa bed ICU: ");
        int sisaBedICU = sc.nextInt();
        System.out.print("Tekanan darah sistolik (mmHg): ");
        int sistolik = sc.nextInt();
        System.out.print("Sadar penuh? (true/false): ");
        boolean sadarPenuh = sc.nextBoolean();
        System.out.print("Suhu tubuh (C): ");
        double suhu = sc.nextDouble();
        System.out.print("Punya riwayat komorbid? (true/false): ");
        boolean komorbid = sc.nextBoolean();
        System.out.print("Usia (tahun): ");
        int usia = sc.nextInt();
        System.out.print("Laju napas (x/menit): ");
        int lajuNapas = sc.nextInt();

        boolean spo2_85_89 = spo2 >= 85 && spo2 < 90;
        boolean spo2_90_94 = spo2 >= 90 && spo2 < 95;
        boolean sistolikTidakNormal = sistolik < 90 || sistolik > 180;

        String lokasi;

        if (spo2 < 85 && sisaBedICU > 0) {
            lokasi = "ICU";
        } else if (spo2 < 85) {
            lokasi = "UGD_VENTILATOR_MOBIL";
        } else if (spo2_85_89 || sistolikTidakNormal || !sadarPenuh) {
            lokasi = "RESUSITASI_UGD";
        } else if ((spo2_90_94 || suhu > 39) && komorbid && usia >= 65) {
            lokasi = "HCU_ISOLASI";
        } else if (spo2_90_94 || lajuNapas > 24) {
            lokasi = "RAWAT_INAP_UMUM";
        } else {
            lokasi = "RAWAT_JALAN";
        }

        System.out.println("Lokasi perawatan: " + lokasi);
        sc.close();
    }
}